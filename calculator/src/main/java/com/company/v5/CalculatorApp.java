package com.company.v5;

import com.company.v5.input.Input;
import com.company.v5.operation.EmptyListException;
import com.company.v5.operation.Operation;
import com.company.v5.operation.OperationFactory;
import com.company.v5.operation.OperationNotFoundException;
import com.company.v5.output.Output;
import com.company.v5.repository.NumberRepository;
import com.company.v5.repository.NumberRepositoryException;

import java.util.List;

public class CalculatorApp {

  //DEPENDENCIES
  private final NumberRepository numberRepository;
  private final Input input;
  private final Output output;

  //CONSTRUCTOR
  // CONSTRUCTOR INJECTION
  public CalculatorApp(NumberRepository numRepo, Input in, Output out) {
    this.numberRepository = numRepo;
    this.input = in;
    this.output = out;
  }

  public void execute(){

    List<Double> numbers = null;
    try {
      numbers = this.numberRepository.readNumbers();
    } catch (NumberRepositoryException e) {

      //log the exception to a log file
      //logger.error("An error occurred while reading numbers", e); //todo: integrate a logger library.

      output.showMessage("An error occurred while reading numbers. Reason: " + e.getMessage());
      return;
    }

    String operationName = this.input.getOperation();

    OperationFactory operationFactory = new OperationFactory();
    Operation operation = null;

    try {
      operation = operationFactory.getInstance(operationName, numbers);
    } catch (OperationNotFoundException e) {
      //todo: log the error
      output.showMessage("Could not find the operation.");
      return;
    }

    if (operation == null) {
      output.showMessage("Couldn't find the operation " + operationName);
      return;
    }

    Double result = operation.perform();

    this.output.showMessage("answer is: " + result);
  }
}

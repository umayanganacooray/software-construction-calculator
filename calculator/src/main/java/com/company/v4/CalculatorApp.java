package com.company.v4;

import com.company.v4.input.Input;
import com.company.v4.operation.Operation;
import com.company.v4.operation.OperationFactory;
import com.company.v4.output.Output;
import com.company.v4.repository.NumberRepository;

import java.io.IOException;
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

  public void execute() throws IOException { //todo: handle exception properly

    List<Double> numbers = this.numberRepository.readNumbers();
    String operationName = this.input.getOperation();

    OperationFactory operationFactory = new OperationFactory();
    Operation operation = operationFactory.getInstance(operationName, numbers);
    Double result = operation.perform();

    this.output.showMessage("answer is: " + result);
  }
}

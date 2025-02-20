package com.company.v5.operation;

import java.util.List;

public class OperationFactory {

  public Operation getInstance(String operationName, List<Double> numbers) throws OperationNotFoundException {

    Operation operation = null;

    if (operationName.equals("add")) {
      operation = new AddOperation(numbers);
    } else if(operationName.equals("mul")) {
      operation = new MulOperation(numbers);
    } else if (operationName.equals("avg")) {
      operation = new AvgOperation(numbers);
    } else {

      throw new OperationNotFoundException("Couldn't find the operation " + operationName);

    }

    return operation;

  }

}

//this class violates open-close principle -> that is a known violation in this pattern.
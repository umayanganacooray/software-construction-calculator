package com.company.v3.operation;

import java.util.List;

public class AddOperation implements Operation{

  private List<Double> values = null;

  public AddOperation(List<Double> numbers) {
    this.values = numbers;
  }

  public Double perform() {

    Double result = 0.0;

    for (Double number : values) {
      result += number;
    }

    return result;
  }


}

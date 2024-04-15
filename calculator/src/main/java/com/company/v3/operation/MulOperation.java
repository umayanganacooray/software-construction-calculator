package com.company.v3.operation;

import java.util.List;

public class MulOperation implements Operation{

  private List<Double> values;

  public MulOperation(List<Double> numbers) {
    this.values = numbers;
  }

  public Double perform() {

    Double result = 1.0;

    for (Double number : values) {
      result *= number;
    }

    return result;
  }


}

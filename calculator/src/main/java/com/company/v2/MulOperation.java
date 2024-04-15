package com.company.v2;

import java.util.List;

public class MulOperation {

  private List<Double> values;

  public MulOperation(List<Double> numbers) {
    this.values = numbers;
  }

  //todo: change this method name
  public Double multiply() {

    Double result = 1.0;

    for (Double number : values) {
      result *= number;
    }

    return result;
  }


}

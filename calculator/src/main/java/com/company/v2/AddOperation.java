package com.company.v2;

import java.util.List;

public class AddOperation {

  private List<Double> values = null;

  public AddOperation(List<Double> numbers) {
    this.values = numbers;
  }

  //todo: change this method name
  public Double add() {

    Double result = 0.0;

    for (Double number : values) {
      result += number;
    }

    return result;
  }


}

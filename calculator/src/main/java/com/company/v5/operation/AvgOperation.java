package com.company.v5.operation;

import java.util.List;

public class AvgOperation implements Operation {

  private List<Double> values = null;

  public AvgOperation(List<Double> numbers) {
    this.values = numbers;
  }

  public Double perform(){

    Double result = 0.0;

    for (Double number : values) {
      result += number;
    }

    return result / values.size();

  }


}

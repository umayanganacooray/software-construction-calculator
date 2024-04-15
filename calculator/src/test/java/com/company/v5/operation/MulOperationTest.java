package com.company.v5.operation;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MulOperationTest {

  //test cases
  //1. multiply two positive values

  @Test
  public void shouldMultiplyTwoPositiveValues() {
    MulOperation operation = new MulOperation(Arrays.asList(2.0, 5.0));
    Double result = operation.perform();
    assertThat(result, is(10.0));
  }

  //2. multiply two negative values


  //3. multiply two zeros


}
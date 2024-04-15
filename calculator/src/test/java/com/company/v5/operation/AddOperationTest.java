package com.company.v5.operation;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddOperationTest {

  //TEST CASES
  // positive + positive => positive
  // 2.0, 3.0 => 5

  @Test
  public void shouldAddTwoPositiveValues(){

    AddOperation addOperation = new AddOperation(Arrays.asList(2.0, 3.0));
    Double result = addOperation.perform();

    //check whether the result is correct or not
    assertThat(result, is(5.0));

  }


  // negative + negative => negative
  // -2.0, -3.0 => -5

  @Test
  public void shouldAddTwoNegativeValues(){

    AddOperation addOperation = new AddOperation(Arrays.asList(-2.0, -3.0));
    Double result = addOperation.perform();

    //check whether the result is correct or not
    assertThat(result, is(-5.0));

  }

}
package com.company.v5.operation;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class AvgOperationTest {

  //test cases
  //1. list of positive and negative values -> calculate avg
  @Test
  public void shouldReturnAverageOfPositiveAndNegativeValues() throws EmptyListException {
      AvgOperation operation = new AvgOperation(Arrays.asList(2.0, -5.0, 0.0, 4.0));
      Double result = operation.perform();
      assertThat(result, is(0.25));
  }

//
//  2. when you provide an empty list...... //HOW TO TEST.....
//  @Test(expected = EmptyListException.class)
//  public void shouldReturnEmptyList() throws EmptyListException {
//      AvgOperation operation = new AvgOperation(Arrays.asList());
//      operation.perform();
//
//
}
package com.company.v5.operation;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class OperationFactoryTest {

  //LET'S TRY TO WRITE UNIT TESTS FOR THE OPERATION FACTORY CLASS

  //test cases
  // 1. add -> AddOperation object
  @Test
  public void shouldReturnAddOperation() throws OperationNotFoundException {

    OperationFactory operationFactory = new OperationFactory();
    Operation result = operationFactory.getInstance("add", Arrays.asList(2.0, 3.0));
    assertThat(result, instanceOf(AddOperation.class));

  }


  // 2. mul -> MulOperation object


  // 3. avg -> AvgOperation object


  // 4. somethingelse -> throw an OperationNotFoundException
  @Test(expected = OperationNotFoundException.class)
  public void shouldThrowAnExceptionForInvalidOperationNames() throws OperationNotFoundException {
    OperationFactory operationFactory = new OperationFactory();
    operationFactory.getInstance("somethingelse", Arrays.asList(2.0, 3.0));

  }

}
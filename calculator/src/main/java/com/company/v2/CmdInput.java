package com.company.v2;

public class CmdInput {

  //this class can't do anything without accessing the args array

  private String[] args = null;

  public CmdInput(String[] a) {

    this.args = a;

  }

  public String getOperation() {

    //todo: need to check the array size and perform error handling
    return args[0];

  }


}
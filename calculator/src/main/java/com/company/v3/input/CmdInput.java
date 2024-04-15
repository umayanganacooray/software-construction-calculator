package com.company.v3.input;

public class CmdInput implements Input{

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

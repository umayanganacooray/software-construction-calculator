package com.company.v5.repository;

public class NumberRepositoryException extends Exception{

  public NumberRepositoryException(String s, Exception e) {
    super(s, e);
  }

  public NumberRepositoryException(String message) {
    super(message);
  }
}

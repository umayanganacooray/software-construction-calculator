package com.company.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileNumberRepository implements NumberRepository {

  public List<Double> readNumbers() throws NumberRepositoryException{
    //reading the text file (assumption - the initial version only has one line in the numbers.txt file)
    List<String> lines = null;

    try {
      lines = Files.readAllLines(Paths.get("/Users/asanka/teaching/se/2023/calculator/src/numbers.txt"));
    } catch (IOException e) {
      throw new NumberRepositoryException("An error occurred. Please make sure the numbers.txt file exists.", e);
    }


    if (lines.isEmpty()) {
      throw new NumberRepositoryException("Numbers file is empty");

      //return new ArrayList<>(); //return an empty list
    }

    String line1 = lines.get(0);

    //convert the line1 into an array of double values
    String[] strNumbers = line1.split(",");
    List<Double> numbers = new ArrayList<>();

    for (String number : strNumbers) {
      try {
        numbers.add(Double.parseDouble(number));
      } catch (NumberFormatException e) {
        throw new NumberRepositoryException("The input value " + number + " is not a valid number.", e);
      }
    }

    return numbers;
  }


}

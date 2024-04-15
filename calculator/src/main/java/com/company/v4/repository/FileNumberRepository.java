package com.company.v4.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileNumberRepository implements NumberRepository {

  public List<Double> readNumbers() throws IOException { //todo: do better exception handling
    //reading the text file (assumption - the initial version only has one line in the numbers.txt file)
    List<String> lines = Files.readAllLines(Paths.get("/Users/asanka/teaching/se/2023/calculator/src/numbers.txt"));
    String line1 = lines.get(0);

    //convert the line1 into an array of double values
    String[] strNumbers = line1.split(",");
    List<Double> numbers = new ArrayList<>();

    for (String number : strNumbers) {
      numbers.add(Double.parseDouble(number));
    }

    return numbers;
  }


}

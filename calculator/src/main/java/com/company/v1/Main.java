package com.company.v1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        //reading the text file (assumption - the initial version only has one line in the numbers.txt file)
        List<String> lines = Files.readAllLines(Paths.get("/Users/asanka/teaching/se/2023/calculator/src/numbers.txt"));
        String line1 = lines.get(0);

        //convert the line1 into an array of double values
        String[] strNumbers = line1.split(",");
        List<Double> numbers = new ArrayList<>();

        for (String number : strNumbers) {
            numbers.add(Double.parseDouble(number));
        }

        String operation = args[0];

        Double result = 0.0;

        if (operation.equals("add")) {
            //let's do add operation here
            for (Double number : numbers) {
                result += number;
            }

        } else if(operation.equals("mul")) {
            //let's do the multiplication operation
            result = 1.0;
            for (Double number : numbers) {
                result *= number;
            }
        }


        System.out.println("answer is: " + result);


        // read the numbers txt file - done
        // read the operation from the first cmd arg (assume: initial version supports only add and mul operations)
        // perform the operation on the numbers
        // print the output to the console

        //software -> change
        // possible changes
        // 1. read the operation from a user input (using scanner)
        // 2. another operation to calculate the avg
        // 3. read more lines from the file
        // 4. store the result in another text file
        // 5. read numbers from a database or some other place
        // ....

        //in order to accommodate above changes we have to edit this existing Main class...
        // CHANGING THE EXISTING CODE!!!!!! -> HIGH RISK

        // OPEN CLOSE PRINCIPLE -> the code that you write should be open for `extension` but closed for `modification`
        // Above code violates the open-close principle

        // what is meant by extension? - Adding new parts/requirements

        // then how to write that kinda code??


        // This code violates "SINGLE RESPONSIBILITY PRINCIPLE"
        // SINGLE RESPONSIBILITY PRINCIPLE -> A class should have only one reason to change
    }
}

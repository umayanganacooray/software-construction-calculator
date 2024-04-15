package com.company.v3;

import com.company.v3.input.CmdInput;
import com.company.v3.input.Input;
import com.company.v3.operation.AddOperation;
import com.company.v3.operation.MulOperation;
import com.company.v3.operation.Operation;
import com.company.v3.output.ConsoleOutput;
import com.company.v3.output.Output;
import com.company.v3.repository.FileNumberRepository;
import com.company.v3.repository.NumberRepository;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        NumberRepository numberRepository = new FileNumberRepository();
        List<Double> numbers = numberRepository.readNumbers();

        Input input = new CmdInput(args);
        String operation = input.getOperation();

        Double result = 0.0;

        if (operation.equals("add")) {
            //let's do add operation here
            Operation addOperation = new AddOperation(numbers);
            result = addOperation.perform();

        } else if(operation.equals("mul")) {
            Operation mulOperation = new MulOperation(numbers);
            result = mulOperation.perform();
        }

        Output consoleOutput = new ConsoleOutput();
        consoleOutput.showMessage("answer is: " + result);

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

        // refactoring

        // - Create a class per responsibility - Single responsibility principle

        // when creating a new class -> Naming is very important
        // in order to read the numbers.txt file -> class name should be?

        // class name -> Noun
        // method/function name -> verb/action

        // Repository pattern -> class name: FileNumberRepository -> methods -> read(), write(), update()

        //suggest a class name for reading the operation -> CmdInput -> readOperation();

        //suggest a class name for the add operation -> AddOperation

        //Dependency Inversion Principle -> Depend on abstractions not on concretions

        // Abstract
        // Interface
        // Concrete


        // things to do:
          // factory pattern
          // constructor injection -> worker classes and orchestrates
          // better exception handling
          // unit tests


        // Liskov substitution principle
        // Interface segregation principle
        // Coupling and Cohesion
        // Naming


        // Clean code by robert c. martin -> download and read
        // Head first design patterns -> read the first chapter


    }
}

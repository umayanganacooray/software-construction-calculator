package com.company.v5;

import com.company.v5.input.CmdInput;
import com.company.v5.input.Input;
import com.company.v5.operation.EmptyListException;
import com.company.v5.output.ConsoleOutput;
import com.company.v5.output.Output;
import com.company.v5.repository.FileNumberRepository;
import com.company.v5.repository.NumberRepository;

import java.io.IOException;

public class Main {

    public static void main(String[] args){

        NumberRepository numberRepository = new FileNumberRepository();
        Input input = new CmdInput(args);
        Output output = new ConsoleOutput();

        CalculatorApp app = new CalculatorApp(numberRepository, input, output);
        app.execute();
    }
}

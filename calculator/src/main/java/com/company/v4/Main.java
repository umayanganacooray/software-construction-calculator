package com.company.v4;

import com.company.v4.input.CmdInput;
import com.company.v4.input.Input;
import com.company.v4.output.ConsoleOutput;
import com.company.v4.output.Output;
import com.company.v4.repository.FileNumberRepository;
import com.company.v4.repository.NumberRepository;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        NumberRepository numberRepository = new FileNumberRepository();
        Input input = new CmdInput(args);
        Output output = new ConsoleOutput();

        CalculatorApp app = new CalculatorApp(numberRepository, input, output);
        app.execute();
    }
}

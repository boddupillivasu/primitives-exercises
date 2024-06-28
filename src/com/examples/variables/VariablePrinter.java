package com.examples.variables;

public class VariablePrinter {
    // instance variable
    int instanceVar;

    public static void main(String[] args) {

        //here we can access instance variable by using reference variable
        VariablePrinter test = new VariablePrinter();
        test.instanceVar = 1234567;

        System.out.println("the instance variable:" + test.instanceVar);

    }
}

package com.examples.variables;

public class AutomaticConversion {
    public static void main(String[] args) {
        int value;
        value = 12332;

/* here we are doing implicit conversion and the small datatype convert into the
large datatype(means:byte)
here the data will never loss
 */
        double value2;
        value2 = value;
        System.out.println("the implicit conversion :" + value2);

    }
}

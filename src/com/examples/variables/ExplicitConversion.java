package com.examples.variables;

public class ExplicitConversion {
    public static void main(String[] args) {
        int value;
        value = 123;

        double value1;
        value1 = 234.34;

         /*here we do an explicit conversion // automatic conversion
         i.e  the higher datatype value is  converted to the lower datatype value
         and the data will be  loss

          */

        value = (int) value1;
        System.out.println("the final value :" + value);
    }
}

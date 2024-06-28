package com.examples.variables;

public class AsciiValue {
    public static void main(String[] args) {
        // here we declare char datatype
        char symbol;
        symbol = 'v';
        /*  here we declare int datatype and after the conversion we get ascii values

         */
        int ascii1;
        ascii1 = (int) symbol;
        System.out.println("the ascii value:" + ascii1);

        // here we declare int datatype
        int ascii2;
        ascii2 = 118;

        /*  here we declare char datatype and after the conversion we get char

         */

        char idol;
        idol = (char) ascii2;
        System.out.println("the ascii char:" + idol);
    }
}

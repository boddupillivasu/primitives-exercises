package com.examples.variables;

public class Scopes {

    /*here we declare a static variable and it can access by using class
    it stores  static pool in heap memory
     */
    static int value1 = 1234567; // static variable

    /*here we declare a  instance variable and it can access by using reference variable and also
    it will store in heap memory
     */
    int value2 = 1234567; // instance variable

    public static void main(String[] args) {

        // here we declare local variable it stores in stack memory
        int value3;
        value3 = 1234567; // local variable
        Scopes task = new Scopes();
        System.out.println("the local variable:" + value3);
        System.out.println("the static variable:" + Scopes.value1);
        System.out.println("the instance variable:" + task.value2);

    }
}

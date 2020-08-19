package com.company;

public class Main {

    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1.0, 1.0);                                                   // . Creating a new object type ComplexNumber and passing 2 parameters.
        ComplexNumber number = new ComplexNumber(2.5, -1.5);                                               // . Creating a new object type ComplexNumber and passing 2 parameters.
        one.add(1,1);                                                                                      // . Calling the class "add" from the object "one", it will add the parameters to the object one.

        System.out.println("one.real= " + one.getReal());                                                               // . Printing the results for both instances.
        System.out.println("one.imaginary= " + one.getImaginary());

        one.subtract(number);                                                                                           // . Calling the class "subtract" from the object "one", it will detract the parameters to the object one.

        System.out.println("one.real= " + one.getReal());                                                               // . Printing the results for both instances.
        System.out.println("one.imaginary= " + one.getImaginary());

        number.subtract(one);                                                                                           // . Calling the class "subtract" from the object "number", it will detract the parameters to the object number.

        System.out.println("number.real= " + number.getReal());                                                         // . Printing the results for both instances.
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}

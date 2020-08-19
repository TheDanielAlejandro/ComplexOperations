package com.company;

public class ComplexNumber {                                                                                            // . Creating a class "ComplexNumber" with 2 instances real and imaginary.

    private double real;
    private double imaginary;


    // CONSTRUCTOR

    public ComplexNumber(double real, double imaginary){                                                                // . The constructor has 2 parameters real and imaginary.
        this.real = real;
        this.imaginary = imaginary;
    }

    // GET METHODS

    public double getReal() {                                                                                           // . First method that returns the element real.
        return real;
    }

    public double getImaginary(){                                                                                       // . First method that returns the element real.
        return imaginary;
    }

    // ADD METHODS

    public void add(double real, double imaginary){                                                                     // . Method "add" with two parameters real and imaginary.
        this.real += real;                                                                                              // . When the method is called is going to add the parameters to the instance values.
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber comNum){                                                                              // . Method "add" with one parameter type ComplexNumber.
        add(comNum.real,comNum.imaginary);                                                                              // . Calling the method add and passing as parameters the class "real" and "imaginary" of the object class type ComplexNumber.
    }


    // SUBTRACT METHODS

    public void subtract(double real, double imaginary){                                                                // . Method "subtract" with two parameters real and imaginary.
        this.real -= real;                                                                                              // . When the method is called is going to detract from the instance values the parameters passed.
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber comNum){                                                                         // . Method "subtract" with one parameter type ComplexNumber.
        subtract(comNum.real, comNum.imaginary);                                                                        // . Calling the method subtract and passing as parameters the classes "real" and "imaginary" of the class type ComplexNumber.
    }
}

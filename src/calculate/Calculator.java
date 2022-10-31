package calculate;
/*
Create four methods with names "addition","subtraction","division" and "multiplication"
All methods are instance method and it doesn't return anything.
but it has two parameters with name "int a" and "int b".
 */

public class Calculator {

    // Method for addition
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    // Method for subtraction
    public void substract(int a, int b) {
        System.out.println(a - b);
    }

    // Method for multiplication
    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    // Method for division
    public void divide(int a, int b) {
        System.out.println(a / b);
    }

    public void calculateResult(int a, int b, char c) {
        Calculator calc = new Calculator();
        if (c == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (c == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (c == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (c == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Please enter correct symbol");
        }


    }
}

// Problem-1.java

import java.util.Scanner;

class Calculator {
    double a, b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double operate(String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            default:
                System.out.println("Invalid Operation");
                return 0;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b);
        double result = calc.operate(op);
        System.out.println("Result: " + result);
    }
}

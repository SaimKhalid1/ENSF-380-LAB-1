package srf;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Process CLI arguments
            processArgs(args);
        } else {
            // No CLI arguments, ask for user input
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter operation (e.g., add, subtract, multiply, divide, factorial, sqrt, pow) or 'exit' to quit:");
                String operation = scanner.next();
                if (operation.equalsIgnoreCase("exit")) {
                    break;
                }
                performOperation(operation, scanner);
            }
        }
    }

    // Method placeholders for operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static double factorial(double n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    // Process CLI arguments
    public static void processArgs(String[] args) {
        if (args.length < 3) {
            System.out.println("Invalid arguments. Usage: <operation> <operand1> <operand2>");
            return;
        }
        String operation = args[0];
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);

        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + add(num1, num2));
                break;
            case "subtract":
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case "multiply":
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case "divide":
                System.out.println("Result: " + divide(num1, num2));
                break;
            case "pow":
                System.out.println("Result: " + pow(num1, num2));
                break;
            default:
                System.out.println("Unsupported operation: " + operation);
        }
    }

    // Perform operation based on user input
    public static void performOperation(String operation, Scanner scanner) {
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Enter the first operand:");
                double addNum1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                double addNum2 = scanner.nextDouble();
                System.out.println("Result: " + add(addNum1, addNum2));
                break;
            case "subtract":
                System.out.println("Enter the first operand:");
                double subNum1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                double subNum2 = scanner.nextDouble();
                System.out.println("Result: " + subtract(subNum1, subNum2));
                break;
            case "multiply":
                System.out.println("Enter the first operand:");
                double mulNum1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                double mulNum2 = scanner.nextDouble();
                System.out.println("Result: " + multiply(mulNum1, mulNum2));
                break;
            case "divide":
                System.out.println("Enter the first operand:");
                double divNum1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                double divNum2 = scanner.nextDouble();
                System.out.println("Result: " + divide(divNum1, divNum2));
                break;
            case "factorial":
                System.out.println("Enter a number:");
                double factNum = scanner.nextDouble();
                System.out.println("Result: " + factorial(factNum));
                break;
            case "sqrt":
                System.out.println("Enter a number:");
                double sqrtNum = scanner.nextDouble();
                System.out.println("Result: " + sqrt(sqrtNum));
                break;
            case "pow":
                System.out.println("Enter the base:");
                double base = scanner.nextDouble();
                System.out.println("Enter the exponent:");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + pow(base, exponent));
                break;
            default:
                System.out.println("Unsupported operation: " + operation);
        }
    }
}

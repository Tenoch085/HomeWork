package hw16;

public class Calculator {

    // Додавання
    public double add(double a, double b) {
        return a + b;
    }

    // Віднімання
    public double subtract(double a, double b) {
        return a - b;
    }

    // Множення
    public double multiply(double a, double b) {
        return a * b;
    }

    // Ділення
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed"); // Виправлено на ArithmeticException
        }
        return a / b;
    }
}
package hw16;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("2.0 + 3.0 = " + calculator.add(2.0, 3.0));
        System.out.println("3.0 - 2.0 = " + calculator.subtract(3.0, 2.0));
        System.out.println("2.0 * 3.0 = " + calculator.multiply(2.0, 3.0));
        System.out.println("6.0 / 3.0 = " + calculator.divide(6.0, 3.0));
    }
}
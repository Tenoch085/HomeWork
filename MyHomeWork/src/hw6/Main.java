package hw6;

public class Main {
    public static void main(String[] args) {
        int totalSum = 0; // змінна для загальної суми
        // Цикл для проходження через числа від 1 до 6
        for (int num = 1; num <= 6; num++) {
            totalSum += num; // додаємо поточне число до загальної суми
            System.out.println(num + ") Num is " + num + ", sum is " + totalSum); // виводимо поточну інформацію
        }
        // Виведення загальної суми
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + totalSum);
    }
}
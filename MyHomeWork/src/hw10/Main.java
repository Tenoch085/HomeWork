package hw10;

import java.util.Scanner;

public class Main {



    // Обчислення квадрата числа
    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Квадрат числа " + number + " дорівнює " + square + ".");
    }

    // Обчислення об'єму циліндра
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Обчислення суми всіх елементів масиву
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Обертання рядка
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    // Обчислення a^b
    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    // Виведення рядка n разів
    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Квадрат числа
        System.out.print("1. Введіть ціле число: ");
        int number = scanner.nextInt();
        printSquare(number);

        // Об'єм циліндра
        System.out.print("2. Введіть радіус: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту: ");
        double height = scanner.nextDouble();
        double volume = cylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        // Введення масиву чисел
        System.out.print("3. Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = sumArray(numbers);
        System.out.println("Масив чисел: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        // Зворотній рядок
        scanner.nextLine(); // очищуємо буфер
        System.out.print("4. Введіть рядок: ");
        String inputText = scanner.nextLine();
        String reversedText = reverseString(inputText);
        System.out.println("Рядок в зворотньому порядку: " + reversedText);

        // Піднесення до степеня
        System.out.print("5. Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        int result = power(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + result + ".");

        // Виведення тексту n разів
        System.out.print("6. Введіть ціле число n: ");
        int repetitions = scanner.nextInt();
        scanner.nextLine(); // очищуємо буфер
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        printTextNTimes(repetitions, text);

        scanner.close();
    }
}

package hw7;

public class Main {

    public static void main(String[] args) {
        // Створення масиву з 20 елементами
        int[] arr = new int[20];

        // Заповнення масиву випадковими числами від -100 до 100 за допомогою Math.random()
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 201) - 100; // Генерація числа в діапазоні від -100 до 100
        }

        // Виведення елементів масиву
        System.out.println("Елементи масиву:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Знайти суму всіх від'ємних чисел
        int negativeSum = 0;
        for (int num : arr) {
            if (num < 0) {
                negativeSum += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);

        // Знайти кількість парних та непарних чисел
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);

        // Знайти найбільший та найменший елементи масиву та їхні індекси
        int minValue = arr[0];
        int maxValue = arr[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Найменший елемент: " + minValue + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + maxValue + " (з індексом " + maxIndex + ")");

        // Знайти середнє арифметичне чисел після першого від'ємного числа
        int firstNegativeIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex != -1 && firstNegativeIndex < arr.length - 1) {
            int sumAfterFirstNegative = 0;
            int countAfterFirstNegative = 0;

            for (int i = firstNegativeIndex + 1; i < arr.length; i++) {
                sumAfterFirstNegative += arr[i];
                countAfterFirstNegative++;
            }

            double average = (double) sumAfterFirstNegative / countAfterFirstNegative;
            System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + average);
        } else {
            System.out.println("Від'ємних чисел немає або вони знаходяться в кінці масиву.");
        }
    }
}
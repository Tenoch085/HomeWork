package hw8;

public class Main {
    public static void main(String[] args) {
        // Створення масиву з 15 елементами
        int[] arr = new int[15];

        // Заповнення масиву випадковими цілими числами від 1 до 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }

        // Виведення початкового вигляду масиву
        System.out.println("Початковий масив:");
        printArray(arr);

        // Сортування масиву за допомогою сортування вставкою
        insertionSort(arr);

        // Виведення відсортованого масиву
        System.out.println("\nВідсортований масив:");
        printArray(arr);

        // Задаємо значення для пошуку
        int target = 77;

        // Виконання бінарного пошуку
        int index = binarySearch(arr, target);

        // Виведення результату пошуку
        if (index != -1) {
            System.out.println("Число " + target + " знайдено на індексі: " + index);
        } else {
            System.out.println("Число " + target + " не знайдено в масиві.");
        }
    }

    // Алгоритм сортування вставкою
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Переміщуємо елементи, які більші за key, на одну позицію вправо
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Алгоритм бінарного пошуку
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Якщо target дорівнює середньому елементу
            if (arr[mid] == target) {
                return mid;
            }

            // Якщо target більший за середній елемент
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // Якщо target менший за середній елемент
            else {
                right = mid - 1;
            }
        }

        // Якщо елемент не знайдений
        return -1;
    }

    // Виведення масиву
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
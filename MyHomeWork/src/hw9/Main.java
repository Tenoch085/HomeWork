package hw9;

public class Main {
    public static void main(String[] args) {
        // Розміри матриці
        int n = 4;

        // Створення матриці 4x4
        int[][] matrix = new int[n][n];

        // Заповнення матриці випадковими числами від 1 до 50 з використанням Math.random()
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 50) + 1; // Генеруємо число від 1 до 50
            }
        }

        // Виведення матриці
        System.out.println("Матриця:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Сума елементів у парних та непарних рядках
        int sumEvenRows = 0, sumOddRows = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    sumEvenRows += matrix[i][j];
                }
            } else {
                for (int j = 0; j < n; j++) {
                    sumOddRows += matrix[i][j];
                }
            }
        }

        // Добуток елементів у парних та непарних стовпцях (використовуємо long)
        long productEvenCols = 1, productOddCols = 1;  // Використовуємо long замість int
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    productEvenCols *= matrix[i][j];
                }
            } else {
                for (int i = 0; i < n; i++) {
                    productOddCols *= matrix[i][j];
                }
            }
        }

        // Виведення результатів
        System.out.println("\nСума елементів у парних рядках (0, 2): " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках (1, 3): " + sumOddRows);
        System.out.println("Добуток елементів у парних стовпцях (0, 2): " + productEvenCols);
        System.out.println("Добуток елементів у непарних стовпцях (1, 3): " + productOddCols);

        // Перевірка на магічний квадрат
        if (isMagicSquare(matrix)) {
            System.out.println("\nЦе магічний квадрат.");
        } else {
            System.out.println("\nЦе не магічний квадрат.");
        }
    }

    // Метод для перевірки чи є матриця магічним квадратом
    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int magicSum = 0;

        // Сума першого рядка
        for (int j = 0; j < n; j++) {
            magicSum += matrix[0][j];
        }

        // Перевірка сум рядків
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }

        // Перевірка сум стовпців
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                return false;
            }
        }

        // Перевірка суми головної діагоналі
        int diagonalSum1 = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum1 += matrix[i][i];
        }
        if (diagonalSum1 != magicSum) {
            return false;
        }

        // Перевірка суми побічної діагоналі
        int diagonalSum2 = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum2 += matrix[i][n - 1 - i];
        }
        if (diagonalSum2 != magicSum) {
            return false;
        }

        return true;
    }
}
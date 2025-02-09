package hw5;

public class Main {

    public static void main(String[] args) {
        // Задаємо суму доходу
        double income = 17000;

        // Змінна для збереження суми податку
        double tax = 0;

        // Розрахунок податку
        if (income <= 10000) {
            tax = income * 0.025; // 2.5% для доходу до 10000
        } else if (income <= 25000) {
            tax = 10000 * 0.025 + (income - 10000) * 0.043; // 4.3% для доходу від 10000 до 25000
        } else {
            tax = 10000 * 0.025 + 15000 * 0.043 + (income - 25000) * 0.067; // 6.7% для доходу понад 25000
        }

        // Виводимо результат
        System.out.printf("Сума доходу: %.2f\n", income);
        System.out.printf("Сума податку: %.2f\n", tax);
    }
}
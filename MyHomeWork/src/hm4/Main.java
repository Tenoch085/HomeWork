package hm4;

public class Main {

    public static void main(String[] args) {

        // Дані для товарів: назва, ціна та кількість проданих одиниць
        String product1 = "smartphone";
        double price1 = 2426.68; // ціна за одиницю
        int quantity1 = 5; // кількість одиниць
        int days1 = 5; // кількість днів торгівлі

        String product2 = "laptop";
        double price2 = 1498.12; // ціна за одиницю
        int quantity2 = 7; // кількість одиниць
        int days2 = 7; // кількість днів торгівлі

        // Обчислюємо загальні продажі для кожного товару
        double totalSales1 = price1 * quantity1;
        double totalSales2 = price2 * quantity2;

        // Обчислюємо середньоденну суму продажів для кожного товару
        double dailySales1 = totalSales1 / days1;
        double dailySales2 = totalSales2 / days2;

        // Виводимо результат, форматуючи числа до двох знаків після коми
        System.out.printf("Product No 1: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.\n",
                product1, days1, totalSales1, dailySales1);

        System.out.printf("Product No 2: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.\n",
                product2, days2, totalSales2, dailySales2);
    }
}
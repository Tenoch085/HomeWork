package hw15;

// Головний клас для запуску програми
public class Main {
    public static void main(String[] args) {
        Advice advice = new AdviceImpl();

        // Тестуємо різні дні тижня
        advice.advise(Day.MONDAY);   // Виведе: "Будній день: працюйте продуктивно!"
        advice.advise(Day.FRIDAY);   // Виведе: "Happy Friday!"
        advice.advise(Day.SATURDAY); // Виведе: "Вихідні! Рекомендую відвідати парк або музей."
    }
}
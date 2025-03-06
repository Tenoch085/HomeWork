package hw12;

public class Main {

    public static void main(String[] args) {
        // Тестуємо клас Employee
        Employee employee = new Employee("Іван Іванов", "Менеджер", "ivan@example.com", "0987654321", 30);
        System.out.println(employee);

        // Тестуємо клас Car
        Car car = new Car();
        car.start();  // викликає метод start, який запускає внутрішні процеси
    }
}

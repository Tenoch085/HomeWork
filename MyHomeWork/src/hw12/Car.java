package hw12;

// Клас Автомобіль
public class Car {

    // Публічний метод для старту автомобіля
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    // Приватні методи, що відображають внутрішню поведінку автомобіля

    private void startElectricity() {
        System.out.println("Електрична система запущена.");
    }

    private void startCommand() {
        System.out.println("Система управління активована.");
    }

    private void startFuelSystem() {
        System.out.println("Паливна система запущена.");
    }
}

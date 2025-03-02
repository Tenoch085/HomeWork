package hw11;

// Клас Person
class Person {
    // Поля класу
    private String name;
    private int age;
    private String profession;

    // Конструктор класу для ініціалізації полів
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // Метод для отримання інформації про особу
    public void displayInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Професія: " + profession);
    }

    // Метод для зміни професії
    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }
}

// Головний клас програми
public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класу Person
        Person person1 = new Person("Євген", 30, "Інженер");
        Person person2 = new Person("Ольга", 25, "Лікар");
        Person person3 = new Person("Петро", 40, "Вчитель");

        // Виведення інформації про осіб
        System.out.println("Інформація про першу особу:");
        person1.displayInfo();
        System.out.println();

        System.out.println("Інформація про другу особу:");
        person2.displayInfo();
        System.out.println();

        System.out.println("Інформація про третю особу:");
        person3.displayInfo();
        System.out.println();

        // Зміна професії для одного з об'єктів
        person2.setProfession("Розробник");

        // Виведення оновленої інформації
        System.out.println("Оновлена інформація про другу особу:");
        person2.displayInfo();
    }
}

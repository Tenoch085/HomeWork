package hw14;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();

        // Тестові повідомлення
        Printer.Message message1 = new Printer.Message("Як тебе звати?", "Олександр");
        printer.print(message1);

        Printer.Message message2 = new Printer.Message("Котра година?", null);
        printer.print(message2);

        Printer.Message message3 = new Printer.Message(null, null);
        printer.print(message3);
    }
}
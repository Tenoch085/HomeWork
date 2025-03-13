package hw14;

class PrinterImpl implements Printer {

    // Реалізація методу print
    @Override
    public void print(Message message) {
        // Перевірка на порожні або null значення
        if (message.getText() == null && message.getSender() == null) {
            // Створення анонімного класу для порожнього повідомлення
            Printer anonymousPrinter = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anonymousPrinter.print(message);
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            // Якщо sender порожній або null
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            // Якщо sender присутній
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }
}
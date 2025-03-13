package hw14;

interface Printer {
    void print(Message message);

    // Статичний внутрішній клас Message в інтерфейсі Printer
    class Message {
        private String text;
        private String sender;

        // Конструктор для всіх параметрів
        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        // Геттери та сеттери
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }
}

package hw15;

// Реалізація інтерфейсу Advice
class AdviceImpl implements Advice {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Будній день: працюйте продуктивно!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Вихідні! Рекомендую відвідати парк або музей.");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }
    }
}
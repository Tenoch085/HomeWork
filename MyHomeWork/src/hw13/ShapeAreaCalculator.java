package hw13;

public class ShapeAreaCalculator {
    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        // Створення масиву фігур
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(8);      // Задаємо радіус кола
        shapes[1] = new Triangle(3, 6); // Задаємо основу та висоту трикутника
        shapes[2] = new Square(7);      // Задаємо сторону квадрата

        // Виведення сумарної площі
        System.out.println("Сумарна площа всіх фігур: " + getTotalArea(shapes));
    }
}
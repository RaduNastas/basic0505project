package javaPro.lesson3.task2;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(4, 5),
                new Circle(3),
                new Rectangle(2.5, 6),
                new Circle(1.2)
        };

        printAreas(shapes);
    }

    public static void printAreas(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + " area: " + shapes[i].getArea());
        }
    }

}
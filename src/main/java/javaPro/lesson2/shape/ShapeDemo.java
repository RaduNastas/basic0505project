package javaPro.lesson2.shape;

public class ShapeDemo {

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4);

        circle.displayInfo();
        rectangle.displayInfo();
        triangle.displayInfo();
    }

}
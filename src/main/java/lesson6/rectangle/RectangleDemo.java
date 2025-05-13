package lesson6.rectangle;

public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        double length = 5;
        double width = 10;

        double area = rectangle.calculateArea(length, width);
        double perimeter = rectangle.calculatePerimeter(length, width);

        System.out.printf("Rectangle area is: %.2f%n", area);
        System.out.printf("Rectangle perimeter is: %.2f%n", perimeter);
    }

}
package javaBasis.lesson6.rectangle;

/**
 * Create a Rectangle class that will represent a rectangle and provide methods
 * to calculate its area and perimeter.
 * Methods:
 * double calculateArea(double length, double width)
 * — returns the area of the rectangle.
 * double calculatePerimeter(double length, double width)
 * — returns the perimeter of the rectangle.
 */

public class Rectangle {

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculatePerimeter(double length, double width) {
        return (length + width) * 2;
    }

}
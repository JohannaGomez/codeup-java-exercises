package shapes;

//public class Rectangle {
//  Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width.
//  Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//
//  Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:

//    perimeter = 2 x length + 2 x width
//    area = length x width

//    protected int length;
//    protected int width;
//
//    // Constructor:
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public Rectangle() {
//
//    }
//
//
//
//    // =================================== Methods:  ==================================================================
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return 2 * length + 2 * width;
//    }
//}

    // =================================  Interfaces and abstract Exercises ===========================================
//    Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
//    IntelliJ can automatically create the skeleton of all the methods that need to be implemented.

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}




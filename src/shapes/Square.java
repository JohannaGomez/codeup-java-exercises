package shapes;

//public class Square extends Rectangle {

////    Create a class named Square, also inside of shapes, that extends Rectangle.
////    Square should define a constructor that accepts one argument, side, and calls the parent's constructor
////    to set both the length and width to the value of side.
//
//    public int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
////    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//
////    perimeter = 4 x side
////    area = side ^ 2
//
//    public double getArea() {
//        return side * side;
//    }
//
//    public double getPerimeter() {
//        return 4 * side;
//    }

//}

// =================================  Interfaces and abstract Exercises ===========================================
//    Change your existing Square class to extend Quadrilateral.
//    Because the length of all sides of a sqare are the same,
//    the methods for setting the length and the width should set both protected properties.

public class Square extends Quadrilateral {

    protected double side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void setLength(int side) {

    }

    @Override
    public void setWidth(int side) {

    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

}

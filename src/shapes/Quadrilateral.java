package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    //    4.- Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable.
//    This class should have:
//    * protected properties for length and width
//    * a constructor that accepts two numbers for the length and width and sets those properties
//    * methods for getting the length and width
//    * abstract methods for setting the length and width

    protected int length;
    protected int width;


    //Constructor:
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Default constructor:
    public Quadrilateral() {

    }

    // Getters:
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }


    // Abstract setters (notice:  no body):
    public abstract void setLength(int length);
//    {
//        this.length = length;
//    }

    public abstract void setWidth(int width);
//    {
//        this.width = width;
//    }


}

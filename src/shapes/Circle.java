package shapes;

public class Circle {

    private double radius;

    //constructor:
    public Circle(double radius) {
        this.radius = radius;
    }

    // getter:
//    public double getRadius() {
//        return radius;
//    }

    // setter:
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}

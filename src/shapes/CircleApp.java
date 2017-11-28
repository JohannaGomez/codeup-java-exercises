package shapes;

public class CircleApp {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        System.out.println("the area is: " + cir.getArea());
        System.out.println("the circumference is: " +cir.getCircumference());

    }
}

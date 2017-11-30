package shapes;

public class ShapesTest {
    public static void main(String[] args) {

//  Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,
//  create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class
//  with a width of 4 and a length of 5
//  verify that the getPerimeter and getArea methods return 18 and 20, respectively.


        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("this is the perimeter for box1: " + box1.getPerimeter());
        System.out.println("this is the area for box1: " + box1.getArea());


//  create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//  verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//  In the Square class, override the getArea and getPerimeter methods with the following definitions for a square.

        // This is polymorphism, Rectangle is the parent type which is assigned to the new object Square named box2
        Rectangle box2 = new Square(5);
        System.out.println("this is the perimeter for box2: " + box2.getPerimeter());
        System.out.println("this is the area for box2: " + box2.getArea());

    }
}

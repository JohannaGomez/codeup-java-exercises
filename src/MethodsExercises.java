import java.util.Scanner;
public class MethodsExercises {
    // public dataType methodName ([parameters] {}
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);

//        System.out.println("my luch bill is $10");
//        double myLunchBill = 10.00;
//        System.out.println("I always tip 20%");
//        int tipPercent = 20;
//        double amountITip =tipAmount(myLunchBill, tipPercent);
//        System.out.println("on a " + myLunchBill + " sized bill, When I tip"
//                + tipPercent + ", the amount I leave on the table is "
//                + amountITip);


//        System.out.println("please enter a number: ");
//        int userInt = scan.nextInt();
//        if (isNegative(userInt)) {
//            System.out.println("your number is negative");
//        } else if (isPositive(userInt)) {
//            System.out.println("your number is positive");
//        } else {
//            System.out.println("your number is neither negative nor positive");
//        }


//    }

//    public static double tipAmount (double billTotal, int percentageTip) {
//        double tipAmount = billTotal * (percentageTip / 100);
//        return tipAmount;
//    }

    // write a f that takes in an integer and returns a boolean if the integer is negative
    // return type means the data type of the value returned by the method.


//    public static boolean isNegative(int number) {
//        return number <0;
//    }

    // Method overloading when use the same name of the method but with another functionality
//    public static boolean isNegative (double number) {
//        return number < 0;
//    }

//    public static boolean isPositive(int number) {
//        return number > 0;
//    }

    // Method overloading:
//    public static boolean isPositive (double number) {
//        return number > 0;
//    }

//    public static String sayHello(String name) {
//        return "Hello" + name;
//    }

    // When it is void, it wont need a return:
//    public static void sayHi(String name) {
//        System.out.println("hi");
//    }

//    public static void sayHelloToPerson(String name) {
//        System.out.println("hello" + name);
//    }


    // ============================================ Curriculum Exercises  ==========================================
//    Basic Arithmetic
//    Create four separate methods. Each will perform an arithmetic operation:
//    -Addition
//    -Substraction
//    -Multiplication
//    -Division
//    Each function needs to take two parameters/arguments so that the operation can be performed.
//    Test your functions and verify the output.
//    Add a modulus function that finds the modulus of two numbers.
//
//    Food for thought: What happens if we try to divide by zero? What should happen?

//    Bonus:
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).
//    Do the above with recursion.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number 1");
        int userInt1 = scan.nextInt();
        System.out.println("enter number 2");
        int userInt2 = scan.nextInt();

        System.out.println("addition: " + addition(userInt1, userInt2));
        System.out.println("substraction: " + substraction(userInt1, userInt2));
        System.out.println("multiplication: " + multiplication(userInt1, userInt2));
        System.out.println("division: " + division(userInt1, userInt2));
        System.out.println("modules: " + modules(userInt1, userInt2));

    }

    public static int addition(int number1, int number2) {
        int addition = number1 + number2;
        return addition;
    }



    public static int substraction(int number1, int number2) {
        int substraction = number1 - number2;
        return substraction;
    }



    public static int multiplication(int number1, int number2) {
        int multiplication = number1 * number2;
        return multiplication;
    }

    public static float division(float number1, float number2) {
        float division = number1 / number2;
        return division;
    }

    public static float modules(float number1, float number2) {
        float modules = number1 % number2;
        return modules;
    }


}

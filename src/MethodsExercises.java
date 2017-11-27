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
//    1.-  =================== Basic Arithmetic
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
//
//    Bonus:
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).
//    Do the above with recursion.



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Basic arithmetic input and outputs:

//        System.out.println("enter number 1");
//        int userInt1 = scan.nextInt();
//        System.out.println("enter number 2");
//        int userInt2 = scan.nextInt();
//
//        System.out.println("addition: " + addition(userInt1, userInt2));
//        System.out.println("substraction: " + substraction(userInt1, userInt2));
//        System.out.println("multiplication: " + multiplication(userInt1, userInt2));
//        System.out.println("multiplication without star: " + multiplicationWithOutStar(userInt1, userInt2));
//        System.out.println("division: " + division(userInt1, userInt2));
//        System.out.println("modules: " + modules(userInt1, userInt2));


        // Get integer and factorial souts:
        String choice = "y";

        do {
            // Validating the input from user:
            int userInput = getInteger(1, 10);
            System.out.println("The user entered: " + userInput);

            // Getting the factorial of the user number:
//            System.out.println("And the factorial is: " + factorial(userInput));

//            long highestInteger = factorial(userInput);
//            long newRange = getInteger(1, highestInteger);
//            System.out.println("the new factorial es: " + factorial(newRange));

            // Asking to continue or not:
            System.out.print("Continue? (y/n): ");
            choice = scan.next();
            System.out.println();


        } while (choice.equalsIgnoreCase("y"));



        // Roll dice souts:
//        System.out.print("enter the number of sides for a pair of dice:  ");
//        rollDice(getInteger(1,10), scan);

    }



    // Methods:

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

    // Bonus:
    public static int multiplicationWithOutStar(int number1, int number2) {
        int mult = 0;
        for (int i = 1; i <= number2; i = i + 1) {
            mult = mult + number1;
        }
        return mult;
    }


    public static float division(float number1, float number2) {
        float division = number1 / number2;
        if (number2 == 0) {
            division = 0;
        }
        return division;
    }

    public static float modules(float number1, float number2) {
        float modules = number1 % number2;
        return modules;
    }




//    2.- ===============   Create a method that validates that user input is in a certain range
//    The method signature should look like this:


    public static int getInteger(int min, long max){
        int userInput;
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Enter a number between " + min + " and " + max + ": ");
        userInput = input.nextInt();

        if (userInput <= max && userInput >= min){
            return userInput;
        } else {
            return getInteger(min, max);
        }

    }

//    Justin's solution:
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        if (!sc.hasNextInt()) {
//            System.out.println("Not a number!");
//            return getInteger(min, max);
//        }
//        int userInput = sc.nextInt();
//        if (userInput >= min && userInput <= max) {
//            return userInput;
//        } else {
//            System.out.println("Number not in range!");
//            return getInteger(min, max);
//        }
//    }


//    3.- ======================Calculate the factorial of a number.
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24


    public static long factorial(long userInput) {
        long factorial = 1;
        for (int i = 1; i <=userInput; i = i+1){
            factorial = factorial * i;
        }
        return factorial;
    }

//    Bonus
//
//    Test the application and find the integer for the highest factorial that can be accurately calculated
//    by this application, then modify the prompt so that it prompts the user for a
//    number "from 1 to {the highest integer that returns accurate factorial calculation}".
//    Don’t forget to change your verification too!
//    Use Recursion to implement the factorial.

    public static void rollDice(int sides, Scanner input){

        while(true){
            System.out.println("Type \"R\" to roll the dice please... ");
            String userInput = input.nextLine();

            if(userInput.equalsIgnoreCase("r")){
                System.out.println("dices: " + RandomNumber(1, sides) + " " + RandomNumber(1, sides));
            }else{
                System.out.println("Not a valid option, exiting...");
                break;
            }
        }

    }

    public static int RandomNumber(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }


}

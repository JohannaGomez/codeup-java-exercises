package util;


import java.util.Scanner;

public class Input {
//      create a class named Input that has a private property named scanner. When an instance of this object is created,
//      the scanner property should be set to a new instance of the Scanner class.

    private Scanner scanner;
    // Note:  scanner can be changed to sc or scan ....  the class Scanner with capital S, stays like that.


    //  === Constructor:
    public Input(){
        scanner = new Scanner(System.in);
        // or this.scnner = new Scanner(System.in)
        // the new word is creating an object from the Scanner class
    }


    public String getString(){
        String userString = scanner.next();
        return userString;
    }

    // Justin's solution:
//    public String getString(){
//         return scanner.nextLine();
//    }

    public boolean yesNo(){
        String userChoice = this.scanner.next();
        if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }

    }


    // Getting an Integer:
//    public int getInt(){
//        if (scanner.hasNextInt()) {
//            return scanner.nextInt();
//        } else {
//            System.out.println("not an integer!");
//            scanner.next();  // progresses the scanner
//            return getInt();
//        }
//    }

    //Exceptions and Errors:
    public int getInt(){
        try {
            int input = Integer.valueOf(getString());
            return input;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("That's not an integer! Try again!");
            return getInt();
        }
    }

    // Overloading getInt:
    public int getInt(int min, int max){
        int userInput = getInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInt(min, max);
        }
    }

    // Getting doubles:
//    public double getDouble() {
//        if (scanner.hasNextDouble()) {
//            return scanner.nextDouble();
//        } else {
//            System.out.println("not a decimal!");
//            scanner.next();  // progresses the scanner
//            return getDouble();
//        }
//    }

    //Exceptions and Errors:
    public double getDouble() {
        try {
            double input = Double.valueOf(getString());
            return input;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("That's not an integer! Try again!");
            return getDouble();
        }
    }


    // Overloading getDouble:
    public double getDouble(double min, double max){
        double userInput = getDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getDouble(min, max);
        }

    }


//    Your getInt and getDouble methods should make sure that the value returned from the method is actually an int or a double.
//    Do this by using the following methods:
//    Integer.valueOf(String s);
//    Double.valueOf(String s);
//    Note these methods will throw a NumberFormatException if the given input cannot be parsed as
//    an integer or double. Your methods on the input class should handle these exceptions.


}

//
//package util;
//
//        import java.util.Scanner;
//
//public class Input {
//    private Scanner scan;
//
//    public static boolean isNumeric(String str) {
//        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
//    }
//
//    public Input() {
//        this.scan = new Scanner(System.in).useDelimiter("\n");
//    }
//
//    public String getString() {
//        return this.scan.next();
//    }
//
//    public boolean isAlpha(String name) {
//        return name.matches("^[\\p{L} .'-]+$");
//    }
//
//    public String getAlphaOnly(String prompt) {
//
//        System.out.println(prompt);
//        String userInput = this.scan.next();
//        if (isAlpha(userInput)) {
//            return userInput;
//        } else {
//            System.out.println("Input should only be letters");
//            return getAlphaOnly(prompt);
//        }
//
//    }
//
//    public String getString(int maxLength, String prompt) {
//        System.out.println(prompt);
//        String userInput = this.scan.next();
//        if (userInput.length() < maxLength || userInput.length() > maxLength || !(isNumeric(userInput))) {
//            System.out.println("Input must be " + maxLength + " digits long without any special characters or spaces");
//            return getString(maxLength, prompt);
//        } else {
//            return userInput;
//        }
//    }
//
//    public String getString(String prompt) {
//        System.out.println(prompt);
//        return this.scan.next();
//    }
//
//
//    public boolean yesNo() {
//        String input = this.scan.next();
//        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean yesNo(String prompt) {
//        System.out.println(prompt);
//        String input = this.scan.next();
//        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int getInt(int min, int max) {
//        System.out.println("Please input an integer between " + min + " and " + max);
//
//        int userInput = this.getInt();
//
//        if (userInput > max || userInput < min) {
//            return getInt(min, max);
//        } else {
//            return userInput;
//        }
//    }
//
//    public int getInt(int min, int max, String prompt) {
//        System.out.println(prompt);
//
//        int userInput = this.getInt();
//
//        if (userInput > max || userInput < min) {
//            return getInt(min, max);
//        } else {
//            return userInput;
//        }
//    }
//
//
//    public int getInt() {
//        String userInput = this.scan.next();
//        try {
//            return Integer.valueOf(userInput);
//        } catch (NumberFormatException e) {
//            System.out.println("Your input must be a number");
//            System.out.println(e.getMessage());
//            return getInt();
//        }
//    }
//
//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        return getInt();
//    }
//
//    public double getDouble(double min, double max) {
//        System.out.println("Please input an decimal number between " + min + " and " + max);
//
//        double userInput = this.getDouble();
//
//        if (userInput > max || userInput < min) {
//            return getDouble(min, max);
//        } else {
//            return userInput;
//        }
//    }
//
//    public double getDouble(double min, double max, String prompt) {
//        System.out.println(prompt);
//
//        double userInput = this.getDouble();
//
//        if (userInput > max || userInput < min) {
//            return getDouble(min, max);
//        } else {
//            return userInput;
//        }
//    }
//
//    public double getDouble() {
//        String userInput = scan.next();
//
//        try {
//            return Double.valueOf(userInput);
//        } catch (NumberFormatException e) {
//            System.out.println("Your input must be a double");
//            return getDouble();
//        }
//    }
//
//    public double getDouble(String prompt) {
//        System.out.println(prompt);
//        return getDouble();
//    }
//}
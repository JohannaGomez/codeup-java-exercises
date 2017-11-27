package util;


import java.util.Scanner;

public class Input {
//      create a class named Input that has a private property named scanner. When an instance of this object is created,
//      the scanner property should be set to a new instance of the Scanner class.

    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }


    public String getString(){
        String userString = scanner.next();
        return userString;
    }

    public boolean yesNo(){
        String userChoice = scanner.next();
        if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }

    }

    public int getInt(int min, int max){
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Not a number!");
            return getInt(min, max);
        }
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInt(min, max);
        }

    }


    public double getDouble(double min, double max){
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextDouble()) {
            System.out.println("Not a number!");
            return getDouble(min, max);
        }
        double userInputDouble = scanner.nextDouble();
        if (userInputDouble >= min && userInputDouble <= max) {
            return userInputDouble;
        } else {
            System.out.println("Number not in range!");
            return getDouble(min, max);
        }

    }
//
//    public double getDouble() {
//
//    }

}

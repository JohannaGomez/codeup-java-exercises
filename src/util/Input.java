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



    public int getInt(){
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("not an integer!");
            scanner.next();  // progresses the scanner
            return getInt();
        }
    }

    // Overloading:
    public int getInt(int min, int max){
        int userInput = getInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInt(min, max);
        }
    }


    public double getDouble() {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("not a decimal!");
            scanner.next();  // progresses the scanner
            return getDouble();
        }
    }


    public double getDouble(double min, double max){
        double userInput = getDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getDouble(min, max);
        }

    }


}

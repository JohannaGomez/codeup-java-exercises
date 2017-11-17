import java.util.Scanner;
//* write your java code in a .java file
//* send your java code to your compiler (javac)
//* compiler compiles your java code inte bytecode
//* JVM is the interpreter that runs the bytecode
    // JVM is interpreting bytecode to machine code


public class ControlFlowExercises {
    public static void main(String[] args) {
        System.out.println("let's make a loop!!");
        Scanner scan = new Scanner(System.in);
//        System.out.print("what is your starting number?? ");
//        int start = scan.nextInt();
//        System.out.print("what is your ending number? ");
//        int end = scan.nextInt();


        // ================using a while loop:
//        System.out.print("what do you want to increase by each time? ");
//        int incrementer = scan.nextInt();
//
//        // ask if incrementer is greater than zero and positive.
//        // if it is not, ask again
//        while (incrementer <= 0) {
//            System.out.println("please enter an integer greater than 0: ");
//            incrementer = scan.nextInt();
//        };


        //  ============refactor while loop to a do while:
//        int incrementer;
//
//        do {
//            // run the code inside the do body at least once
//            System.out.print("enter an integer greater than 0: ");
//            incrementer = scan.nextInt();
//        } while (incrementer <= 0);


        // =============== condition to start the for loop:
//        if(start < end){
//            // for(starting number: condition to enter the loop; incrementer)
//            for (int i = start; i <= end; i += incrementer) {
//                System.out.println(i);
//            }
//        } else {
//            for (int i = start; i >= end; i -= incrementer) {
//                System.out.println(i);
//            }
//        }


//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <=15) {
//            System.out.println(i);
//            i = i + 1;
//        };

//        ================================   Do While and For Loop ============================================
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        // Do While:
//        int x = 0;
//        do {
//            x = x + 2;
//            System.out.println(x);
//
//        } while(x <100);
        // For loop:
//        for (int x = 0; x <= 100; x = x + 2) {
//            System.out.println(x);
//        }


//        Alter your loop to count backwards by 5's from 100 to -10.

        // Do while:
//        int x = 100;
//        do {
//            System.out.println(x);
//            x = x - 5;
//        } while(x >= -10);

        // For Loop:
//        for(int x = 100; x >= -10; x = x -5) {
//            System.out.println(x);
//        }

//        Create a do-while loop that starts at 2, and displays the number squared on each line
//        while the number is less than 1,000,000.
        // Do while:
//        long y = 2;
//        do {
//            System.out.println(y);
//            y = y * y;
//        } while (y < 65537);
        // For loop:
//        for (long y = 2; y < 65537; y = y * y) {
//            System.out.println(y);
//        }


//        Fizzbuzz
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.

//        for (int x = 1; x <=100; x += 1) {
//            if ((x % 3 == 0)  &&  (x % 5 == 0)) {
//                System.out.println("fizzBuzz");
//                continue;
//            }
//            if(x % 3 == 0) {
//                System.out.println("fizz");
//                continue;
//            }
//            if (x % 5 == 0) {
//                System.out.println("buzz");
//                continue;
//            }
//            System.out.println(x);
//        }

//        Display a table of powers.
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        System.out.print("enter an integer: ");
//        int userInteger = scan.nextInt();
//        String header = "Number |" + "Squared   |" + "Cubed " + "\n"
//                    +   "-------|" + "----------|" + "------";
//        System.out.println(header);
//        int square = 0;
//        int cube = 0;
//        String row = "";
//        for (int i = 1; i <= userInteger; i = i + 1) {
//            square = i * i;
//            cube = i * i * i;
//
//            row = i + "      |" + square + "         |" + cube;
//            System.out.println(row);
//        }

//        Convert given number grades into letter grades.
//
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        int yourNumericalGrade;
        String choice = "y";
//
        do {
            do {
                // run the code inside the do body at least once
                System.out.print("enter your numerical grade than 0: ");
                yourNumericalGrade = scan.nextInt();
            } while (yourNumericalGrade <= 0);

            if (yourNumericalGrade >= 88 && yourNumericalGrade <=100){
                System.out.println("your Grade is: A! Congratulations!");
            } else {
                if (yourNumericalGrade >= 80 && yourNumericalGrade <= 87) {
                    System.out.println("Your Grade is: B!");
                } else {
                    if (yourNumericalGrade >= 67 && yourNumericalGrade <= 79) {
                        System.out.println("Your Grade is: C!");
                    } else {
                        if (yourNumericalGrade >= 60 && yourNumericalGrade <= 66) {
                            System.out.println("Your Grade is: d!");
                        } else {
                            System.out.println("Your Grade is: F, look for another school");
                        }
                    }
                }

            }
            System.out.print("Continue? (y/n): ");
            choice = scan.next();
            System.out.println();

        } while (choice.equalsIgnoreCase("y"));









//        int x = 2;
//        int y = 3;
//        if (false & ++x == y) {
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal");
//        }
//        System.out.println(x);
//
//        String test = "test";
//        String toast = "toast";
//        boolean stringCompare = test.equals(toast);
//        System.out.println(stringCompare);

    }
}

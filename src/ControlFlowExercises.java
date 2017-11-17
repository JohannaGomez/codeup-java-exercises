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
        System.out.print("what is your starting number?? ");
        int start = scan.nextInt();
        System.out.print("what is your ending number? ");
        int end = scan.nextInt();


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
        int incrementer;

        do {
            // run the code inside the do body at least once
            System.out.print("enter an integer greater than 0: ");
            incrementer = scan.nextInt();
        } while (incrementer <= 0);


        // =============== condition to start the for loop:
        if(start < end){
            for (int i = start; i <= end; i += incrementer) {
                System.out.println(i);
            }
        } else {
            for (int i = start; i >= end; i -= incrementer) {
                System.out.println(i);
            }
        }
        // for(starting number: condition to enter the loop; incrementer)





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

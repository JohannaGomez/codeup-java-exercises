import java.util.Scanner;

public class InterviewPractice {
    public static void main (String arg[]) {
        System.out.println("Hello, world");


        //while:
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i = i + 1;
//        }



        // Do while:
//        long x = 2;
//        do {
//            System.out.println(x);
//            x = x * x;
//        } while (x < 1000000L);


        // for loop:
//        for (long y =2; y < 1000000L ; y = y * y) {
//            System.out.println(y);
//        }


        // Fizzbuzz:
//        for (int i = 1; i <= 100; i = i + 1) {
//            if((i % 3 == 0) &&(i % 5 == 0)){
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            }
//            System.out.println(i);
//        }


        // Fibonacci:
        // Scanner user input:
        int userInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number: ");
        userInput = scan.nextInt();
        System.out.println("you entered" + " " + userInput);
        System.out.println("Fibonacci effect:");
        int n1 = 0, n2 = 1, i, n3;
        System.out.print(n1 + " " + n2);
        for(i = 1; i <= userInput; i = i + 1) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }


    }
}

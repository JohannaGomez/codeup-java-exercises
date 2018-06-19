import java.util.Scanner;

public class InterviewPractice {
    public static void main (String arg[]) {

        System.out.println("Hello, world");

        // Scanner user input:
        int userInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number: ");
        userInput = scan.nextInt();
        System.out.println("you entered" + " " + userInput);


        //while:
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i = i + 1;
//        }


        // Do while:
//        long x = 2;
//        do {
//            System.out.println("square: " + x);
//            x = x * x;
//        } while (x < 1000000L);


        // for loop:
//        for (long y =2; y < 1000000L ; y = y * y) {
//            System.out.println("square: " + y);
//        }


        // Fizzbuzz:
//        System.out.println("Fizzbuzz exercise: ");
//        for (int j = 1; j <= 100; j = j + 1) {
//            if((j % 3 == 0) &&(j % 5 == 0)){
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            if (j % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            }
//            if (j % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            }
//            System.out.println(j);
//        }



        // Fibonacci when user enter a number:
        System.out.println("Fibonacci effect:");
        int n1 = 0, n2 = 1, a, n3;
        System.out.print(n1 + " " + n2);
        for(a = 1; a <= userInput; a = a + 1) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }




        // Get the minimum coins combination:
//        int [] values = {1,3,5};
//        System.out.println(getMinCoins(values, 7));
//
//
//        // Get the factorial of a number provided by the user:
//        System.out.println("factorial is: " + factorial(userInput));

    }


    //  Method to get the minimum coins:
//    public static int getMinCoins (int[] values, int sum) {
//        if (sum ==0) {
//            return 0;
//        }
//
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < values.length; i = i+1) {
//            if (sum >= values[i]) {
//                min = Math.min(min, getMinCoins(values, sum - values[i]));
//            }
//        }
//        return min + 1;
//
//    }


    // Method to get the factorial of the user input:
//    public static long factorial(long userInput) {
//        long factorial = 1;
//        for (int i = 1; i <=userInput; i = i+1){
//            factorial = factorial * i;
//        }
//        return factorial;
//    }



}

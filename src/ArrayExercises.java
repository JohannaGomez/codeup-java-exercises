import java.util.Arrays;


public class ArrayExercises {


// 5. Write a method named FizzBuzzify that takes in the array of integers and returns a new array of strings. In the output array of strings, numbers that are evenly divisible by both 3 and 5 should be replaced with "FizzBuzz", numbers evenly divizible by 3 should be replaced with "Fizz", numbers evenly divisible by 5 should be replaced with "Buzz", and all other numbers should be stored as a string version.
//    Example:
//    // input (generated by exercise #2 above)
//    int[] randomInts = {2, 37, 6, 15, 10, 1, 4};
//
//    // output
//    String[] fizzBuzzedArray = {"2", "37", Fizz", "FizzBuzz", "Buzz", "1", "4"};


    // 2. In the main method, generate 100 random integers and store them in an array.
    public static void main(String[] args) {

        // Creating empty arrays with a determinated length:
        int[] numbersArray = new int[10];
        String strArray[] = new String[numbersArray.length];


        // Storing random numbers in the array of numbers:
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = getRandomIntBetween(1,10);
        }


        // Converting the numbers from the array into string:
        for (int i = 0; i < numbersArray.length; i++) {
            strArray[i] = String.valueOf(numbersArray[i]);
        }

        // Testing out the results:
        System.out.println("array of numbers is: " + Arrays.toString(numbersArray));
        System.out.println("counting odds: " + countOdds(numbersArray));
        System.out.println("average of the array: " + average(numbersArray));
        System.out.println("array of strings: " + Arrays.toString(strArray));
        System.out.println(strArray[5].valueOf(strArray[5]));
//        FizzBuzzify(numbersArray);



    }



    // 1. Write a method named getRandomIntBetween that returns a random integer between a provided min and max value.
    public static int getRandomIntBetween(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    // 3. Write a method named countOdds that returns a count of all the odd numbers in that array.
    public static int countOdds (int[] numbersArray) {
        int x = 0;
        for (int i = 0; i < numbersArray.length; i++)  {
            if (numbersArray[i] % 2 == 0) {
                x = x + 1;
            }
        }
        return x;
    }

    // 4. Write a method named average that returns the average of every integer in that array.
    public static float average (int[] numbersArray){
        int sumOfIntegers = 0;
        for (int i = 0; i < numbersArray.length; i++)  {
            sumOfIntegers = sumOfIntegers + numbersArray[i];
        }
        return sumOfIntegers / numbersArray.length;
    }

    // 5. Write a method named FizzBuzzify that takes in the array of integers and returns a new array of strings. In the output array of strings, numbers that are evenly divisible by both 3 and 5 should be replaced with "FizzBuzz", numbers evenly divizible by 3 should be replaced with "Fizz", numbers evenly divisible by 5 should be replaced with "Buzz", and all other numbers should be stored as a string version.
//    Example:
//    // input (generated by exercise #2 above)
//    int[] randomInts = {2, 37, 6, 15, 10, 1, 4};
//
//    // output
//    String[] fizzBuzzedArray = {"2", "37", Fizz", "FizzBuzz", "Buzz", "1", "4"};

//    String[] twoBadgers = Arrays.copyOf(testArray, 2);
//                System.out.println(Arrays.toString(twoBadgers));



//    public static String[] FizzBuzzify (String[] strArray) {
//        for (int x = 1; x <=strArray.length; x += 1) {
//            int[] result[] = int.valueof(strArray)[x];
//            if ((result[x] % 3 == 0)  &&  (result[x] % 5 == 0)) {
//                System.out.println("fizzBuzz");
//                continue;
//            }
//            if (strArray[x] % 3 == 0) {
//                System.out.println("fizz");
//                continue;
//            }
//            if (strArray[x]% 5 == 0) {
//                System.out.println("buzz");
//                continue;
//            }
//            System.out.println(x);
//        }
//        return "I dont get this one";
//    }

//    public String[] FizzBuzzify (String[] strArray) {
//        int n = end - start;
//        String[] result = new String[n];
//
//        int pos = 0;
//        for (int i = start; i < end; i++) {
//            boolean fizz = i % 3 == 0;
//            boolean buzz = i % 5 == 0;
//
//            if (fizz && buzz) result[pos] = "FizzBuzz";
//            else if (fizz) result[pos] = "Fizz";
//            else if (buzz) result[pos] = "Buzz";
//            else result[pos] = String.valueOf(i);
//            pos++;
//        }
//        return result;
//    }




}
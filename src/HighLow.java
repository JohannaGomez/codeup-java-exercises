import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int random = randomNumber(1, 100);
        System.out.println("random Number from math.random is: " + random);
        System.out.println("Enter a number between 1 and 100 to guess the random number: ");
        int userRandomNumber = scan.nextInt();
        guessingNumber(userRandomNumber);
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number
//    All user inputs are validated
//    If user's guess is less than the number, it outputs "HIGHER"
//    If user's guess is more than the number, it outputs "LOWER"
//    If a user guesses the number, the game should declare "GOOD GUESS!"
//    Hints
//
//    Use the random method of the java.lang.Math class to generate a random number.
//    Bonus
//
//    Keep track of how many guesses a user makes
//    Set an upper limit on the number of guesses

    }

    public static int randomNumber(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static int getIntegerforRandom(int min, long max) {
        int userInput;
        Scanner input = new Scanner(System.in);
        System.out.println();

//        System.out.println("Enter a number between " + min + " and " + max + ": ");
        userInput = input.nextInt();

        if (userInput <= max && userInput >= min) {
            return userInput;
        } else {
            return getIntegerforRandom(min, max);
        }
    }



    public static void guessingNumber(int userInput) {
        int random = randomNumber(1, 100);
        int userNumber = 0;
        do {
            userNumber = getIntegerforRandom(1, 100);
            if (userNumber < random) {
                System.out.println("HIGHER");
            } else if (userNumber > random) {
                System.out.println("LOWER");
            } else if (userNumber == random) {
                System.out.println("YOU GUESSED RIGHT!");
            }
        } while (userNumber != random);

    }
}




//    public static void game101(Scanner scan){
//
//        int random = generateRandom(1, 100);
//        int number = 0;
//        System.out.println("random" + random);
//
//        while(true){
//
//            number = getInteger(1, 100, scan);
//
//            if(number < random){
//                System.out.println("Higher");
//            }else if(number > random){
//                System.out.println("Lower");
//            }else if(number == random){
//                System.out.println("You guessed right!");
//                break;
//            }
//
//        }





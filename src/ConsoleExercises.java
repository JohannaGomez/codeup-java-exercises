import java.util.Scanner;

public class ConsoleExercises {
    /* making a new object */
    public static void main(String[] args) {
//        String userInput;
        Scanner scan = new Scanner(System.in);
//        System.out.println("Hello, please input your name");
//        userInput = scan.nextLine();
//        userInput = scan.next();
//        System.out.println("hi " + userInput + "! It's nice to meet you.  My name is Pepe");


        // ============================ Explore the Scanner Class=======================================================

        //1.-   Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        System.out.print("what is your favorite number");
//        int userNumber = scan.nextInt();
//        System.out.println("you told me your fav number is : " +  userNumber);
//        scan.nextLine();   // Consume newline left-over and let me include the 3rd word

        //2.-   Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//        String firstWord, secondWord, thirdWord;
//        System.out.println("Hello, please enter 3 words:");
//        firstWord = scan.next();
//        secondWord = scan.next();
//        thirdWord = scan.next();
//        System.out.println("your 3 words were: " + " " + firstWord + " "  + secondWord + " " + thirdWord);
//        scan.nextLine();   // Consume newline left-over and let me include the sentence

        //3.- and 4.- Prompt a user to enter a sentence, then store that sentence in a String variable using
        // the .next method, then display that sentence back to the user.
        // .next() wont capture the sentence, just the first word before the enter

//        String inputASentence;
//        System.out.println("please enter a sentence: ");
//        inputASentence = scan.nextLine();
//        System.out.println("this is your whole sentence: " + inputASentence);



        // ============================ Calculate the perimeter and area of Codeup's classrooms========================

        // 1.-  Prompt the user to enter values of length and width of the classroom.

        //Justin's solution:

                System.out.print("please enter the room length: ");
                String userLength = scan.nextLine();
                double length = Double.parseDouble(userLength);

                System.out.print("please enter the room width: ");
                String userWidth = scan.nextLine();
                double width = Double.parseDouble(userWidth);

                System.out.printf("the length is %f the width is %f\n", length, width);

                double area = width * length;
                double perimeter = 2 * length + 2 * width;
                System.out.printf("%f = %f x %f\n", area, length, width);
                System.out.printf("%f = 2 x %f + 2 x %f\n", perimeter, length, width);

//                System.out.println(area);
//                System.out.println(perimeter);



//        System.out.println("what is the length, width and hight (in that order) of your classroom??:");
//        float length, width, area, perimeter, high, volume;
//        length = scan.nextFloat();
//        width = scan.nextFloat();
//        high = scan.nextFloat();
//        area = length * width;
//        perimeter = 2 * length + 2 * width;
//        volume = length * width * high;
//        System.out.println("the area of your classroom is: " + area);
//        System.out.println("the perimeter of your classroom is: " + perimeter);
//        System.out.println("and the volume of your classroom is: " + volume);
//        scan.nextLine(); // Consume newline left-over and let me include the next line for a quote

//        ================================= CONSOLE IO BONUSES
//        BONUS 1
//        Prompt the user to enter a favorite quote
//        Output the quote
//        Ask them to enter how many words are in the sentence
//        Output the number they entered
//        String favoriteQuote;
//        System.out.println("Please enter your favorite quote here:");
//        favoriteQuote = scan.nextLine();
//        System.out.println("your favorite quote was: " + favoriteQuote);
//        int numberOfWords;
//        System.out.println("how many words are in your quote?");
//        numberOfWords = scan.nextInt();
//        System.out.println("you said there are: " + numberOfWords + " words in your quote!!!");

//        BONUS 2
//        Prompt the user to enter a list of top three favorite foods separated by only spaces
//        Use the printf() to output there three top foods with the format:
//        1) FirstFood
//        2) SecondFood
//        3) ThirdFood
//        String listOfTopThreeFoods;
//        System.out.println("What are your 3 favorite foods??");
//        listOfTopThreeFoods = scan.next();


//        BONUS 3
//        Prompt the user to enter a grocery list of three items
//        Each item should only be separated by a comma (no spaces)
//        You will need to use the .useDelimiter() method on your scanner object
//        Output the result as a comma-separated list using printf()

    }
}

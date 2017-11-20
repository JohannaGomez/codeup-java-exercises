
import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2.-  ================Create a class Bob for the following exercise with a main method.======================

//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question.
//
//        He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//        He answers 'Whatever.' to anything else.
//        Boolean askingQuestion = true;
//        Boolean yellingAtHim = true;
//        Boolean quite = true;
//        Boolean theRest = true;

        Boolean willContinue = true;
        do {
            System.out.print("ask something to Bob:  ");
            String question = sc.nextLine();
            if (question.endsWith("?")) {
                System.out.print("sure");
            } else {
                if (question.endsWith("!")) {
                    System.out.print("Whoa, chill out!");
                } else {
                    if (question.equals(" ")) {
                        System.out.println("Fine, Be that way!");
                    } else {
                        System.out.println("Whatever!");
                    }

                }
            }
            System.out.print("\nDo you wish to continue? [y/n]");
            String userChoice = sc.nextLine();
            if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
                willContinue = true;
            } else {
                willContinue = false;
            }
        } while (willContinue);


    }
}

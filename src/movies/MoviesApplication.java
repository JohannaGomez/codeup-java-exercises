package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {

//        Movie pelicula = new Movie();  // this didn't work.

        Movie[] movies = MoviesArray.findAll();
        System.out.println("What would you like to do?");

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

        System.out.println("Enter your choice: ");


//        String choice = "y";

//        do {
//            // Validating the input from user:
//            int userInput = getInteger(1, 10);
//            System.out.println("The user entered: " + userInput);
//
//            // Getting the factorial of the user number:
////            System.out.println("And the factorial is: " + factorial(userInput));
//
////            long highestInteger = factorial(userInput);
////            long newRange = getInteger(1, highestInteger);
////            System.out.println("the new factorial es: " + factorial(newRange));
//
//            // Asking to continue or not:
//            System.out.print("Continue? (y/n): ");
//            choice = scan.next();
//            System.out.println();
//
//
//        } while (choice.equalsIgnoreCase("y"));


        Input input = new Input();
        do {

        } while (input.yesNo());
        int userMovieOption = input.getInt(0,5);

        if (userMovieOption == 1){
            for (int i = 0; i < movies.length; i++) {
                System.out.println(movies[i].getName() + "--" + movies[i].getCategory());
            }
        } else if (userMovieOption == 2) {
            for (int i = 0; i < movies.length; i++) {
                if (movies[i].getCategory().equalsIgnoreCase("animated")){
                    System.out.println(movies[i].getName() + "--" + movies[i].getCategory());
                }
            }

        } else if (userMovieOption == 3) {
            for (int i = 0; i < movies.length; i++) {
                if (movies[i].getCategory().equalsIgnoreCase("drama")){
                    System.out.println(movies[i].getName() + "--" + movies[i].getCategory());
                }
            }

        } else if (userMovieOption == 4) {
            for (int i = 0; i < movies.length; i++) {
                if (movies[i].getCategory().equalsIgnoreCase("horror")){
                    System.out.println(movies[i].getName() + "--" + movies[i].getCategory());
                }
            }

        } else if (userMovieOption == 5) {
            for (int i = 0; i < movies.length; i++) {
                if (movies[i].getCategory().equalsIgnoreCase("scifi")){
                    System.out.println(movies[i].getName() + "--" + movies[i].getCategory());
                }
            }

        } else {
            System.out.println("you exited the movies application!!!");
        }



    }
}

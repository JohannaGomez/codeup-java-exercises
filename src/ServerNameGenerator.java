
import java.util.Random;

public class ServerNameGenerator {


    // Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
    public  String[] adjectives = {
            "pretty",
            "ugly",
            "smart",
            "thoughtful",
            "tall",
            "thin",
            "short",
            "small",
            "big",
            "beautiful"};

    public  String[] nouns = {"mom", "dad", "son", "daughter", "aunt", "uncle", "grandma", "grandpa", "godmother", "godfather"};


    // Add a main method, and inside of your main method select and random noun and adjective and hyphenate the
    // combination and display the generated name to the user.
    public static void main(String[] args) {
        ServerNameGenerator server = new ServerNameGenerator();
        System.out.println("here is your server name:");
        System.out.println(server.getRandomString(server.adjectives) + " - " + server.getRandomString(server.nouns));
    }


    //  Method:
    //  Create a method that will return a random element from an array of strings.
    public static String getRandomString(String[] arrayOfStrings) {
        String randomString = (arrayOfStrings[new Random().nextInt(arrayOfStrings.length)]);
        return randomString;
    }


    //        String randomNoun = (nouns[new Random().nextInt(nouns.length)]);
    //        System.out.println(randomNoun);

}




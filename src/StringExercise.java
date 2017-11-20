public class StringExercise {

    public static void main(String[] args) {

//        .equals(String anotherString)

//            String one = "1";
//            String two = "2";
//            System.out.println(one.equals(two));


//        .equalsIgnoreCase(String anotherString)

//            String greeting = "howdy";
//            System.out.println(greeting.equalsIgnoreCase("HoWDy"));


//        .startsWith(String prefix)

//            String title = "Dr. Doctor";
//            boolean isADoctor = title.toLowerCase().startsWith("dr");
//            System.out.println(isADoctor);


//        .endsWith(String suffix)

//            String travisParkAddress = "311 E Travis St, San Antonio, TX 78205";
//            String codeUpZip = "78205";
//            boolean sameZipAsCodeup = travisParkAddress.endsWith(codeUpZip);
//
//            System.out.println(sameZipAsCodeup);


//        .charAt(int index)
        // consider that this method returns a char type and not a String type

//            boolean firstLetterCapitalized = false;
//            String word = "Test";
//
//            char firstLetter = word.charAt(0);
//
//            if (firstLetter == Character.toUpperCase(firstLetter)) {
//                firstLetterCapitalized = true;
//            }
//
//            System.out.println(firstLetterCapitalized);



//        .indexOf(String subString)

//            String cat = "cat";
//            System.out.println(cat.indexOf("at"));


//        .lastIndexOf(String subString)

//            String good = "Good";
//            System.out.println(good.lastIndexOf("o"));


//        .length()

//            String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
//            System.out.println(longestWord.length());


//        .replace(char oldChar, char newChar)

//            String search = "tiny cats looking cute";
//            String parsedSearch = search.replace(' ', '+');
//            System.out.println(parsedSearch);


//        .substring(int beginIndex[, int endIndex])

//            String name = "Justin Reich";
//            String firstName = name.substring(0, name.indexOf(" "));
//            String lastName = name.substring(name.indexOf(" ") + 1);
//            System.out.println(firstName);
//            System.out.println(lastName);


//        .toLowerCase()
//        .toUpperCase()

//            String hello = "hELlo";
//            System.out.println(hello.toUpperCase());
//            System.out.println(hello.toLowerCase());


//        .trim()

//            String input = "   bob      smith \n\n  ";
//            String trimmedInput = input.trim();
//            System.out.print(trimmedInput);
//            System.out.print("|");


//         convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)

//            String word1 = "Test";
//            String pigLatinWord = word1.trim().toLowerCase().substring(1).concat(word1.substring(0, 1).toLowerCase()).concat("ay");
//            System.out.println(pigLatinWord);

//        =============================== CURRICULUM EXERCISES  ====================================================

//        1.- ===========For each of the following output examples, create a string variable named message that contains
//        the desired output and print it out to the console.
//        Do this with only one string variable and one print statement.

//        We don't need no education
//        We don't need no thought control
//        String message = "We don't need no education \n";
//        System.out.print(message + message.replace("education", "thought control"));

        //Ryan's solution:
//        String messageRyan = "We don't need no education \n";
//        messageRyan += "We don't nee to thought control";
//        System.out.println(messageRyan);

//        Check "this" out!, "s inside of "s!
//        String message = "check \"this\" out!, \" s inside of \" s";
//        System.out.println(message);


//        In windows, the main drive is usually C:\
//        String message = "In windows, the main drive is usually C:\\";
//        System.out.println(message);

//        I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!
//        String message = "I can do backslashes \\, double backslashes \\\\ \nand the amazing triple backslash \\\\\\";
//        System.out.println(message);



    }

}

package grade;
import util.Input;

import java.util.HashMap;


// Create a map for students and Github usernames
// Create a class named GradesApplication with a main method.

public class GradesApplication {


    public static void main(String[] args) {
        // Inside the main method, create a HashMap named students.
        // It should have keys that are strings that represent github usernames,
        // and values that are Student objects. Create at least 4 student objects with at least 3 grades each,
        // and add them to the map.
        // Be creative! Make up github usernames and grades for your student objects.

        HashMap<String, Student> students = new HashMap<>();

        Student pao = new Student("Paola");
        Student abby = new Student("Abby");
        Student nichole = new Student("Nichole");
        Student luke = new Student("Luke");

        students.put("JohannaGomez", pao);
        students.put("abbyperez", abby);
        students.put("nicholekirlim", nichole);
        students.put("lukesaav", luke);

        pao.addGrade(100);
        pao.addGrade(98);
        pao.addGrade(78);

        abby.addGrade(98);
        abby.addGrade(97);
        abby.addGrade(100);

        nichole.addGrade(100);
        nichole.addGrade(90);
        nichole.addGrade(80);

        luke.addGrade(98);
        luke.addGrade(78);
        luke.addGrade(90);

//        System.out.println("for the student: " + students.get("JohannaGomez").getName() + " the average grade is: " + students.get("JohannaGomez").getGradeAverage());
//        System.out.println("for the student: " + students.get("abbyperez").getName() + " the average grade is: " + students.get("abbyperez").getGradeAverage());
//        System.out.println("for the student: " + students.get("nicholekirlim").getName() + " the average grade is: " + students.get("nicholekirlim").getGradeAverage());
//        System.out.println("for the student: " + students.get("lukesaav").getName() + " the average grade is: " + students.get("lukesaav").getGradeAverage());


// ==================================   Create the command line interface  ============================================
//        Print the list of github usernames out to the console, and ask the user which student they would like
//        to see more information about. The user should enter a github username (i.e. one of the keys in your map).
//        If the given input does not match up with a key in your map, tell the user that no users with that username
//        were found. If the given username does exist, display information about that student,
//        including their name and their grades.
//        After the information is displayed, the application should ask the user if they want to continue,
//        and keep running so long as the answer is yes.

        Input input = new Input();
        String userInput;

        System.out.println("Welcome!\n");
        System.out.println("Here are the github usernames of our students:\n");
        showKeys(students);


        do {
            System.out.println("");
            System.out.println("\nWho do you want to get information about?\n");
            userInput = input.getString();

            if(students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println(student.getName() + " has an average grade of :  " + student.getGradeAverage());

            } else {
                System.out.println("No student w/ that username");
            }
            System.out.println("would you like to continue student? [y/n]");

        } while(input.yesNo());

//        do {
//            showKeys(students);
//            System.out.println("\n");
//            System.out.println("What student would you like to see more information on?");
//            userInput = input.getString();
//            if (userInput.equalsIgnoreCase("nicholekirlim")){
//                System.out.println("for the student: " + students.get("nicholekirlim").getName() + " the average grade is: "
//                        + students.get("nicholekirlim").getGradeAverage());
//            } else if (userInput.equalsIgnoreCase("abbyperez")){
//                System.out.println("for the student: " + students.get("abbyperez").getName() + " the average grade is: "
//                        + students.get("abbyperez").getGradeAverage());
//            } else if (userInput.equalsIgnoreCase("lukesaav")) {
//                System.out.println("for the student: " + students.get("lukesaav").getName() + " the average grade is: "
//                        + students.get("lukesaav").getGradeAverage());
//            } else if (userInput.equalsIgnoreCase("JohannaGomez")) {
//                System.out.println("for the student: " + students.get("lukesaav").getName() + " the average grade is: "
//                        + students.get("lukesaav").getGradeAverage());
//            }
//
//
//        } while (userInput.equalsIgnoreCase("nicholekirlim") || userInput.equalsIgnoreCase("abbyperez") || userInput.equalsIgnoreCase("lukesaav") || userInput.equalsIgnoreCase("JohannaGomez"));



    }

    public static void showKeys (HashMap<String, Student> students) {
        // for(DatatypeOfEachElementInTheArray   variableNameWeCallEachElement   : variableNameThatsTheArray)
        for (String key : students.keySet() ) {
            System.out.print("| " + key + " | ");
        }
    }




}

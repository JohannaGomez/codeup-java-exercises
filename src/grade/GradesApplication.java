package grade;
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

        System.out.println("for the student: " + students.get("JohannaGomez").getName() + " the average grade is: " + students.get("JohannaGomez").getGradeAverage());
        System.out.println("for the student: " + students.get("abbyperez").getName() + " the average grade is: " + students.get("abbyperez").getGradeAverage());
        System.out.println("for the student: " + students.get("nicholekirlim").getName() + " the average grade is: " + students.get("nicholekirlim").getGradeAverage());
        System.out.println("for the student: " + students.get("lukesaav").getName() + " the average grade is: " + students.get("lukesaav").getGradeAverage());






    }
}

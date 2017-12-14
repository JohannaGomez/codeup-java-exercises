package grade;

import java.util.ArrayList;
import java.util.Arrays;


public class Student {


    // 1.-  Create a class named Student.
    // It should have private properties for the student's name, and grades.
    // The grades property should be an list of integers.
    private String name;
    private ArrayList<Integer> grades;


    // 2.- The student class should have a constructor that sets name property,
    // and initializes the grades property as an empty list.
    // ===========The constructor creates an instance for the class.======= it runs when we compile the code and in
    // the main

    // Note:  I tried to pass in the array too, but I noticed I couldn't instantiate the object.
    public Student(String name) {
        this.name = name;
        //initializing:
        grades = new ArrayList<>();
    }

    // 3.-  Methods:
    //returns the student's name
    public String getName(){
        return name;

    };

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };

    // returns the average of the students grades
    public double getGradeAverage(){
        int sumOfGrades = 0;
        // for(DatatypeOfEachElementInTheArray variableNameWeCallEachElement : variableNameThatsTheArray)
        for (Integer     grade: grades) {
            sumOfGrades = sumOfGrades + grade;
        }
        return sumOfGrades / grades.size();
    };



    public static void main(String[] args) {
        // Test your Student class by adding a main method and creating Student objects.
        // Verify that you can add grades to each object, and that your getGradeAverage method
        // correctly returns the average of the student's grades.

        Student pao = new Student("Paola");
        Student joha = new Student("Johanna");
        Student rj = new Student("Roy");


        pao.addGrade(100);
        pao.addGrade(98);
        pao.addGrade(78);
//        System.out.println(pao.grades);
        System.out.println("for the student: " + pao.getName() + " the average grade is: " + pao.getGradeAverage());


        joha.addGrade(100);
        joha.addGrade(98);
        joha.addGrade(78);
        System.out.println("for the student: " + joha.getName() + " the average grade is: " + joha.getGradeAverage());

        rj.addGrade(100);
        rj.addGrade(98);
        rj.addGrade(78);
        System.out.println("for the student: " + rj.getName() + " the average grade is: " + rj.getGradeAverage());

    }

}

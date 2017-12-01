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

    // Note:  I tried to pass in the array too, but I noticed I couldnt instantiate the object.
    public Student(String name) {
        this.name = name;
        this.grades = grades;
    }

    // 3.-  Methods:
    //returns the student's name
    public String getName(){
        return name;

    };

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };

    // returns the average of the students grades
    public double getGradeAverage(){
        int sumOfGrades = 0;
        for (Integer grade: grades) {
            sumOfGrades = sumOfGrades + grade;
        }
        return sumOfGrades / grades.size();
    };



    public static void main(String[] args) {
        // Test your Student class by adding a main method and creating Student objects.
        // Verify that you can add grades to each object, and that your getGradeAverage method
        // correctly returns the average of the student's grades.

        Student pao = new Student("Paola");
//        System.out.println(pao.getName());
        ArrayList<Integer> grades = new ArrayList<>();
        pao.grades.add(100);
        pao.grades.add(98);
//        pao.addGrade(98);
//        pao.addGrade(78);
        System.out.println(pao.grades);
    }

}

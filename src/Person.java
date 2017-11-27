//         ============================= OBJECT ORIENTED PROGRAMMING OOP ============================================

public class Person {

    private String name;

    // returns the person's name
    public String getName() {
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("hello " + this.name + " this is Johanna");
    }

    // Constructor:
    public Person(String name){
        this.name = name;
    }

}

class PersonApp {
    public static void main(String[] args) {

        //1.- Object basis:

//        Person person1 = new Person("Paola");
//        System.out.println(person1.getName());
//        person1.setName("mary");
//        person1.sayHello();

        // 2.- Understanding references:
//        ==========
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
        // This one prints out true because the value of both are equal:
//        System.out.println(person1.getName().equals(person2.getName()));

        // This one prints out false because are different objects:
//        System.out.println(person1 == person2);

//        ============
//        Person person1 = new Person("John");
//        Person person2 = person1;
        //This one prints out true because in line 50, the whole object person1 is assigned to person 2:
//        System.out.println(person1 == person2);

//        ===========
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        //This one prints out "Jane" because in line 57, the objects are equal.  Prints "Jane" for person2 too:
        System.out.println(person1.getName());
        System.out.println(person2.getName());


    }
}

//         ============================= OBJECT ORIENTED PROGRAMMING OOP ============================================

public class Person {

    //         ======================== slide 3 (classes and objects)
    public String firstName;
    public String lastName;



    public static void main(String[] args) {
    //         ======================== slide 3 (classes and objects)

        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.firstName);
        System.out.println(rick.lastName);

        Person fred = new Person();
        rick.firstName = "Fred";
        rick.lastName = "Smith";
        System.out.println(rick.firstName);
        System.out.println(rick.lastName);

        // -- Dog Example --
        // this is not going to work because I dont have a class Dog, but it is an example
        // from the lecture:

//        Dog d1 = new Dog();
//        d1.age = 3;
//        d1.breed = "corgi";


        // ======================== slide 4 (object fields)

//        rick.sayHello();

        // -- Dog Method Example --


        // ======================== slide 5 (class fields)

        //            System.out.println(Arithmetic.pi);
        //            System.out.println(Arithmetic.add(5, 5));
        //            System.out.println(Arithmetic.multiply(5, 5));

        // -- DogHelper Example --




    }


}

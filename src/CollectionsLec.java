import java.util.ArrayList;

public class CollectionsLec {

    public static void main(String[] args) {
        ArrayList<Double> doublesArray = new ArrayList<>();
        doublesArray.add(3.5);
        doublesArray.add(7.9);
        System.out.println(doublesArray.toString());
        System.out.println(doublesArray.get(1));
        System.out.println(doublesArray.indexOf(3.5));

        ArrayList<Person> peopleArray = new ArrayList<Person>();
        peopleArray.add(new Person("Jane"));
        peopleArray.add(new Person("Doe"));
        peopleArray.add(new Person("John"));
        for (Person person: peopleArray) {
            System.out.println(person.getName());
        }



    }
}

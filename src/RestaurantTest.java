//Create a class called “RestaurantDish” (you should not include quotes)
//
//        Include an integer property called “costInCents”
//        Include a string property called “nameOfDish”
//        Include a boolean property called “wouldRecommend”
//        Include a method called “eat”
//        this method will print out “Nom nom nom!”
//
//        Create another class called RestaurantTest
//        Add a main method and inside the method...
//        1) instantiate a RestaurantDish object called “dish”
//        2) assign values creative to each of the properties
//        3) print out each of the property values
//        4) test the eat() method by calling it

public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 7800;
        dish.nameOfDish = "Encebollado";
        dish.wouldRecommend = true;
        dish.eat = "Nom nom nom!";

        System.out.println(dish.nameOfDish + " is our best!");
        System.out.println(dish.costInCents + " is the price in cents");
        System.out.println(dish.wouldRecommend);
        System.out.println(dish.eat);

    }
}



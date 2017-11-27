public class BurgerTester {
    public static void main(String[] args) {
//        BurgerTools burger = new BurgerTools();
        BurgerTools.mostPopularTopping = "ketchup";
        System.out.println(BurgerTools.mostPopularTopping);
        System.out.println(BurgerTools.averageDaysBeforeExpiration);
        System.out.println(BurgerTools.temperatureWhenCooked);
        BurgerTools.grill();



    }
}

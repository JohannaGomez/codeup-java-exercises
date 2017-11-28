package util;


public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        // Note:  "input" can be changed to "in" or "inp" ....  the class "Input" with capital "I", stays like that.

        System.out.println("enter a string: ");
        String userString = input.getString();
        System.out.println("your string was: " + userString);

        System.out.println("would you like to continue? (type y or yes) ");
        System.out.println(input.yesNo());

        System.out.println("enter an integer in between 1 and 10: ");
        System.out.println("the number you entered was: " + input.getInt(1, 10));

        System.out.println("enter an decimal number in between 1 and 10: ");
        System.out.println("the number you entered was: " + input.getDouble(1, 10));

        System.out.println("enter any decimal number: ");
        double userDouble = input.getDouble2();
        System.out.println("your decimal number was: " + userDouble);



    }
}

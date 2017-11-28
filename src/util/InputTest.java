package util;


public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        // Note:  "input" can be changed to "in" or "inp" ....  the class "Input" with capital "I", stays like that.

        // GetString Method:
        System.out.println("enter a string: ");
        String userString = input.getString();
        System.out.println("For the getString method, your string was: " + userString);


        // yesNo Method:
        System.out.println("would you like to continue? (type y or yes) ");
        System.out.println("for the yesNo method, your answers was: " + input.yesNo());



        // Ryan's solution for yesNo:
        System.out.println("Please input yes or a no");
        if(input.yesNo()) {
            System.out.println("You input yes or 'y'");
        } else {
            System.out.println("You said anything other than yes.");
        }

        // getInt Method without parameters:
        System.out.println("For the getInt method, enter an integer: ");
        System.out.println("the number you entered was: " + input.getInt());


        // getInt overloading  Method with a range:
        System.out.println("For the getInt overloading method, enter an integer in between 1 and 10: ");
        System.out.println("the number you entered was: " + input.getInt(1, 10));


        // getDouble Method without parameters:
        System.out.println("enter an number: ");
        System.out.println("the number you entered was: " + input.getDouble());

        // getDouble overloading Method with a range:
        System.out.println("enter an decimal number in between 1 and 10: ");
        System.out.println("the number you entered was: " + input.getDouble(1, 10));





    }
}

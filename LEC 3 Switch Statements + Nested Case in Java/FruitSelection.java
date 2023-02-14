import java.util.Scanner;

public class FruitSelection {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit");

        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("King of fruits");
                break;
            case "orange":
                System.out.println("Round fruit");
                break;
            case "apple":
                System.out.println("A red fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");

        }

    }
}
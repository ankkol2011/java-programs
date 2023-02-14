import java.util.Scanner;



public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a character");
        char ch = in.nextLine().trim().charAt(0);

        if (ch >= 'a' && ch<= 'z')
        System.out.println("Lowercase letter");
        else if(ch >='A' && ch <='Z')
        System.out.println("Upper case");
        else 
        System.out.println("Undefined Case");

    }
}

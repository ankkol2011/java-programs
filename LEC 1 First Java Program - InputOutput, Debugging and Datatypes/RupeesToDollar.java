import java.util.*;

public class RupeesToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount in Rupees ");
        System.out.print("Rs. ");
        float rupees = sc.nextFloat();
        System.out.println("Enter current rate of the rupee against the dollar");
        float rate =sc.nextFloat();
        // coversion formula
        float dollar =rupees/rate ;
        System.out.println("The USD coversion is ");
        System.out.print("$ "+dollar);

    }
}

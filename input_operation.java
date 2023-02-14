import java.util.*;
public class input_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number and 2nd number and operator (in sequence)");
        System.out.println();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);

        if(op == '+')
        System.out.println("Addition "+(a+b));
       else if(op == '-')
        System.out.println("Subtraction "+(a-b));
       else if(op == '*')
        System.out.println("Multiplication"+(a*b));
        else
        System.out.println("please choose a valid operator");



    }
    
}

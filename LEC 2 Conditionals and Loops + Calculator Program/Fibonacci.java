import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the count of Fibonacci serires");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count=2;

        if(n==0)
        System.out.println(a);
        else
        {
        for(;count<=n;count++)
        {
            int temp=b;
            b = a + b;
            a= temp;
        }
        System.out.println(b);
        }
    }
    
}

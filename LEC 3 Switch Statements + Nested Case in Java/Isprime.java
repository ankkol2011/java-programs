import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number\n");
        int n = in.nextInt();
        boolean result = Isprime(n);
        System.out.println("Prime :"+result);
    }

    static boolean Isprime(int a)
    {
        if(a==1||a==00)
        return false;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
             return false;
        }
        return true;
    }
    
}

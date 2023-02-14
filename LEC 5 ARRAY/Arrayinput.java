import java.util.Arrays;
import java.util.Scanner;

class Arrayinput
{
    public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
        // int[] arr = new  int[5];
        // System.out.print("Enter 5 numbers");
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
        // System.out.println(arr[3]);

        //input using loops
        // for(int i =0;i< arr.length;i++)
        // {
        //     arr[i]=in.nextInt();
        // }

        //output using loops
        // for(int i =0;i< arr.length;i++)
        // {
        //     System.out.println(arr[i]+" ");
        // }

        //output using for each loop
        // for(int num :arr) //for every element in the array, print the element 
        // {
        //     System.out.print(num + " ");//num represents elements of the array
        // }

        //output using toString()
        // System.out.print(Arrays.toString(arr));

        //Array of objects 
        String[] str  = new String[5];
        System.out.print("Enter 5 names");

        //input using loops
        for(int i = 0;i<str.length; i++)
        {
            str[i]=in.next();
        }

        //output
        System.out.print(Arrays.toString(str));
    

    
    }
}
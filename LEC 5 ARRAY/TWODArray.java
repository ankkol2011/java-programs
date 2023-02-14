import java.util.Scanner;

public class TWODArray 
{
    public static void main(String[] args) {
        // //Square Matrix
        // int[][] arr = {
        //     {1,2,3},  //0th index
        //     {4,5,6},  //1st index       1
        //     {7,8,9}   //2nd index   arr[2][] ={7,8,9}
        // };
        // //output
        // for(int row=0;row<arr.length;row++)
        // {
        //     for(int col=0; col<arr.length;col++)
        //     {
        //         System.out.print(arr[row][col]+" ");
        //     }
        //         System.out.println();
        // }

        // int[][] arr = new int[4][2];
        // System.out.println(arr.length);  // the length function will only print the no.of rows of the 2D array

        // USER INPUT
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        //Taking inputs from user
        System.out.println("Enter the elements");
        for(int row = 0;row<arr.length;row++) //for iterating over no. of rows of 2D array
        {
            for(int col=0;col<arr.length;col++)  //arr[row].length:- means length of  every array at that particular row (like arr[2][]={1,2,3,4}  arr[2].length=4)
            {
                arr[row][col]= in.nextInt(); 
            }
        }

        //OUTPUT
        for(int row = 0;row < arr.length;row++) //for iterating over no. of rows of 2D array
        {
            for(int col=0;col<arr[row].length;col++)  //arr[row].length:- means length of  every array at that particular row (like arr[2][]={1,2,3,4}  arr[2].length=4)
            {
               System.out.print(arr[row][col]+" "); 
            }
            System.out.println();
        }





    }
    
}

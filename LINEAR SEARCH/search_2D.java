import java.util.Arrays;

public class search_2D {
    public static void main(String[] args) {
        int[][] arr ={
                 {-111,2,3},
                 {4,-555},
                 {7,8,9}
               };
        //printing in matrix form
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
            System.out.println();
            }

            int []pos=min_element(arr);
            System.out.println();
            System.out.println(Arrays.toString(pos));
    }

    /* searching  the min element  And returning the indices 
        for the min element in form of an array 
    */
    static int[] min_element(int[][] arr)
    {  
        // int[][] arr1 = new int[arr.length][];
        //edge case
        // if(arr1.length == 0)
        // return {-1,-1};

        int row1=0,col1=0;
        int min =arr[0][0]; 
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(min > arr[row][col]){
                min = arr[row][col];
                
                row1=row;    //storing the indices
                col1=col;    // in new variables (i.e row1,col1)
                }
            }
         }
         int[] arr1 = {row1 ,col1}; //creating a new array initialized with new vairables
        return arr1;
        
        
    }
    
    
}

import java.util.Arrays;

public class search_min {
    public static void main(String[] args) {
        int[] arr = {3,5,6,1,-7};
        System.out.println(Arrays.toString(arr));
        System.out.println("minimum number is "+minsearch(arr));
    }

    static int minsearch(int[] arr)
    {
        //edge cases
            if(arr.length == 0)
                return -1;

        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i])
            min=arr[i];
        }
        return min;
    }

}

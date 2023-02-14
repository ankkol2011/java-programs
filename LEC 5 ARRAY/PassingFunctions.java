import java.util.Arrays;

class PassingFunctions
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void change(int[] xyz)
    {
        xyz[1]=90;                    //arrays are mutable bcz we could change the original object
    }

}

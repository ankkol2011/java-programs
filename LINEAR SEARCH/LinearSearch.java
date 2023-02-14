
class searching{
 public static void main(String[] args) {
    int[] nums = {};
    int target = 1;
    int ans = linearSearch(nums, target);
    System.out.println(ans);
 }

    static int linearSearch(int[] arr, int target)
    { 
        if(arr.length == 0 )
        return target;

        return -1;

    }
}
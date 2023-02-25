public class findevencountNumbers {
    public static void main(String[] args) {
        int[] nums={120,3451,2,6,789};
        System.out.println("No. of even digit numbers "+find_numbers(nums));
    }

    static int find_numbers(int[] nums)
    {
         int count=0,digit;
         for (int i = 0; i < nums.length; i++) {
            digit = countdigit(nums[i]);
            if(digit%2==0)
                count++;
         }
        return count;
    }

    static int countdigit(int num)
    {   int count=0;
        while(num!=0)
        {
            num /= 10;
            count++;
        }
        return count;
    }
    
}

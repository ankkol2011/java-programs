public class Frequency {
    public static void main(String[] args) {
        int n = 35;
        int count = 0;
        while (n>0)
        {
            int rem = n%10;
            if(rem == 4)
            count++;
            
            n/=10;
        }
        System.out.println(count);
    }
    
}

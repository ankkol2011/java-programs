import java.util.Arrays;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr={3,5,6,76,1};
        
        System.out.println(max(arr));
    }

    static int max(int[] arg)
    {
        int maximum =0;
        for(int i=0;i<arg.length;i++)
        {
            if(arg[i]>=maximum)
                maximum=arg[i];
        }
        return(maximum);
    }
    
}

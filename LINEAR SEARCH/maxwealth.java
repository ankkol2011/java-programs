public class maxwealth {
    public static void main(String[] args) {
        int [][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int [][] accounts)
    {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < accounts.length; i++) {
            sum=0;       //Reinitialize sum to 0 after each row iteration
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(max<sum)
            max=sum;
            
           
        }

        return max;
    }
    
}



class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr={2,3,5,6,45,32};
        int len =arr.length-1;
        System.out.println(binary(arr,45,0,len));
    }
    static int binary(int[] arr,int target,int s,int e)
    {
        
        if(s>e){
        return -1;
        }

        int m = s+(e-s)/2;
        if(arr[m]==target){
        return m;
        }

        if (target < arr[m]) {
            return binary(arr, target, s, m - 1);
        }
        return binary(arr, target, m + 1, e);
        
    }

    
}

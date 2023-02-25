public class Search_String {
    public static void main(String[] args) {
        String str = "ankit";
        char target ='s';
        System.out.println("the position of "+target+" is found at "+linearsearch(str,target));
    }

    static int linearsearch(String str, char target)
    {
        
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i))
                return i;
        }
        return -1;
    }
    
}

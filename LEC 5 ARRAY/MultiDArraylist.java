import java.util.ArrayList;
import java.util.Scanner;

class MultiDArraylist
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();

        //initialization of ArrayList
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());
        }
      
        // ArrayList  2dimentional = { , , }  //ArrayList index 0
        //                           { , , }  //ArrayList index 1
        //                           { , , }  //ArrayList index 2
        
         //Taking Input for Multi-Dimensional ArrayList
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                list.get(i).add(in.nextInt());  // list.get(i):- getting the ArrayList index (like ArrayList index 0)
                                                //add(in.nextInt()):- adding numbers to that ArrayList index (like {1,2,3})
            }
        }

        //Output for Multi-Dimensional ArrayList
        for(int i=0;i<3;i++)
        {
            System.out.print(list.get(i));
            System.out.println();
        }
            
    }
        //System.out.println(list.get(0)); // prints only the elements present at ArrayList(index 0)

}

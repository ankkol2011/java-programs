import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list= new ArrayList<Integer>(10);

        // list.add(1);
        // list.add(2);
        // list.add(3); 
        // list.add(4);
        // list.add(5);
        // list.add(6);

        // System.out.println(list);
       // System.out.println(list.contains(9)); // checking element present or not
        // list.set(2, 99);  //update elements of list
        // System.out.println(list);

        //INPUT
        for (int i= 0 ;i<5;i++)
        {
            list.add(in.nextInt());
        }

        //OUTPUT
        for (int i= 0 ;i<5;i++)
        {
            //System.out.println(());  //get item from the list
            list.get(i);
        }
        System.out.print(list);
        

    }
   
    
    
}

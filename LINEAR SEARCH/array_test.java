import java.util.Arrays;

public class array_test {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(Arrays.toString(new int[]{i,j}));/*trying to print array w/o 
                                                                    initialization*/
            }
            System.out.println();
            
        }
    }
}

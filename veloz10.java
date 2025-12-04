import java.util.*;
public class veloz10
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
    int[] arr = {5, 9, 7, 4, 8};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("\nFirst even at index: " + i);
                return;
            }
        }
   

    }
}
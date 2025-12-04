import java.util.*;
public class veloz4
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
        
  int[] arr = {5, 7, 1, 9, 3};
        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("\nSmallest: " + min + ", Largest: " + max);

    }
}
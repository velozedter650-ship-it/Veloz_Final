import java.util.*;
public class veloz7
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
        
int[] arr = {-3, 5, -8, 2};

        System.out.println("\nConverted array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = Math.abs(arr[i]);
            System.out.print(arr[i] + " ");
        }
    }
}
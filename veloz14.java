import java.util.*;
public class veloz14
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
     int[] arr = {1, 2, 3, 4, 5};

        System.out.println("\nReverse:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
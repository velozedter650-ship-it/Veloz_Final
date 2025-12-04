import java.util.*;
public class veloz11
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
    int[] arr = {10, 20, 30, 40, 50};

        System.out.println("\nEven index elements:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
   

    }
}
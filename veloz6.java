import java.util.*;
public class veloz6
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
        
 int[] arr = {3, 8, 5, 11, 4};
        int sum = 0, count = 0;

        for (int n : arr) {
            if (n % 2 != 0) {
                sum += n;
                count++;
            }
        }
        System.out.println("\nAverage of odds: " + (sum / (double) count));
    }
}
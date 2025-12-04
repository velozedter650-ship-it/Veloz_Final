import java.util.*;
public class veloz17
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
     int[] arr = {5, 12, 9, 20, 15};
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > highest) {
                second = highest;
                highest = n;
            } else if (n > second) {
                second = n;
            }
        }

        System.out.println("\nSecond highest: " + second);
    }
}
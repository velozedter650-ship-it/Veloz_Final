import java.util.*;
public class veloz20
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
      String[] names = {"Ana", "Mark", "Luis"};
        int[] arr = {10, 22, 35, 48, 19, 60};

        System.out.println("\nEven numbers >20:");
        for (int n : arr) {
            if (n % 2 == 0 && n > 20) {
                System.out.print(n + " ");
            }
        }
    }
}
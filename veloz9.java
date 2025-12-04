import java.util.*;
public class veloz9
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
        
int sum = 0, num;

        System.out.println("\nEnter numbers (0 to stop):");
        do {
            num = in.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Sum: " + sum);
    }
}
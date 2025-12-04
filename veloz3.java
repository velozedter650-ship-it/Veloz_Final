import java.util.*;
public class veloz3
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
        
      System.out.println("\nTriangle Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
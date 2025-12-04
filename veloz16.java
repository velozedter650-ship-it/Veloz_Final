import java.util.*;
public class veloz16
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
    System.out.print("\n\nEnter a number: ");
        int num = in.nextInt();
        int digits = String.valueOf(num).length();
        System.out.println("Digits: " + digits);
    }
}
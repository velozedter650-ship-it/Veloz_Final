import java.util.*;
public class veloz8
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
        
int[] A = {1, 2, 3, 4};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        System.out.println("\n\nCopied Array B:");
        for (int n : B) System.out.print(n + " ");
    }
}
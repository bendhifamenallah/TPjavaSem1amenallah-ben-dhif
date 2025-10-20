import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in);
        int n;
        
        do {
            System.out.print(" donner number lines: ");
            n = SC.nextInt();
        }
        while( n<=0 );
        
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}
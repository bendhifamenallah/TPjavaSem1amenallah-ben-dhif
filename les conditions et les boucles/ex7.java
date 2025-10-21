import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("donner un entier");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("paire");

        } else {
            System.out.println("impaire");
        }
    }
}

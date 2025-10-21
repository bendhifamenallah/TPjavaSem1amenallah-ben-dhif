import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;

        int n, i;
        do {
            System.out.println("donner n");
            n = sc.nextInt();
        } while (n <= 0);
        ch = "";
        for (i = 1; i <= n; i++) {
            ch = ch + "*";
            System.out.println(ch);
        }

    }
}

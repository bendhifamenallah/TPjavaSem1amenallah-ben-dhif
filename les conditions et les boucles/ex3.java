import java.util.Scanner;

public class mutli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("donner un entier");
        a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" + a * i);
        }
    }
}
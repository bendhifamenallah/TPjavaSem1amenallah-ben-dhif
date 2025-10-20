import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t;
        System.out.println("donner le temperature");
        t = sc.nextDouble();
        if (t <= 0) {
            System.out.println("Glace");
        } else if (t > 0 | t <= 100) {
            System.out.println("eau");

        } else {
            System.out.println("vapeur");
        }
    }

}

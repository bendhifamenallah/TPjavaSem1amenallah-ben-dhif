import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        do {
            System.out.println("donner un chaine ");
            ch = sc.nextLine();

        } while (ch.length() > 30);
        String ch1 = "";
        for (int i = 0; i < ch.length(); i++) {
            int x = (int) (ch.charAt(i) + 3);
            if (x > 122 || x < 90) {
                x = x - 26;
            }
            ch1 = ch1 + (char) x;

        }
        System.out.println(ch1);

    }
}

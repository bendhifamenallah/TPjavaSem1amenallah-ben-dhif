import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un chaine");
        String ch;
        ch = sc.nextLine();
        int s = 0;
        System.out.println("donner un caractére");
        char c;
        c = sc.next().charAt(0);
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == c) {
                s = s + 1;
            }
        }
        if (s > 0) {
            System.out.println(s);
        } else {
            System.out.println("n'existe occun occronce");
        }

    }
}

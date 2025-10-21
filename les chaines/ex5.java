import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        String ch;
        do {
            System.out.println("donner un chaine");
            ch = s.nextLine();
        } while (ch.length() > 30);
        for (int i = 0; i < ch.length(); i++) {
            if (Character.isLowerCase(ch.charAt(i))) {
                a = a + 1;

            }

        }
        System.out.println("lee nombre de character e et minisucule dans ce chaine est" + a);

    }
}

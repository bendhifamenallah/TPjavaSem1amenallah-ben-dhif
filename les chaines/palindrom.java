import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un mot");
        String x, inv = "";
        x = sc.nextLine();
        for (int i = 0; i < x.length(); i++) {
            inv = x.charAt(i) + inv;

        }
        System.out.println(inv);
        if (inv.equals(x)) {
            System.out.println("palendrome");

        } else {
            System.out.println("not palendrome");
        }

    }

}
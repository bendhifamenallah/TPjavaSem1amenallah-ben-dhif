import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez saisir une phrase:");
        /* String ch2 = sc.nextLine(); */
        StringBuffer ch = new StringBuffer(sc.nextLine());
        System.out.println("le conte,u du StingBuffer est :" + ch);
        sc.close();
    }
}

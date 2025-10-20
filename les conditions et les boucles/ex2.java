import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un nomber");
        int n;
        do {

            n = sc.nextInt();
        } while (n < 1 | n > 12);

        switch (n) {
            case 12, 1, 2:
                System.out.println("saison hiver");
                break;
            case 3, 4, 5:
                System.out.println("saison printtemps");
                break;
            case 6, 7, 8:
                System.out.println("saison été");
                break;
            case 9, 10, 11:
                System.out.println("saison automne");
                break;
            default:
                System.out.println("erreur");
                break;
        }

    }

}

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = "Bonjour les Etudiants,bienvenue en Java!";
        StringTokenizer st1 = new StringTokenizer(text1);
        System.out.println("decoupage du texte en mots:");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
        System.out.println("le texte principale est:" + text1);
    }
}

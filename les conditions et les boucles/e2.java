import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("veuillez saisir un phrase:");
        //String ch2=SC.nextLine();
        StringBuffer ch =new StringBuffer(SC.nextLine());
        System.out.println("le contenu de StringBuffer est:" + ch );
        SC.close();

    }
}

import java.util.Scanner;
public class ex4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int f=1,n,r=0;
        System.out.println("donner un nombre");
        n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            f=f*i;
        }
    System.out.println("le fac de "+n+"est  "+f);
}
}

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner SC= new Scanner(System.in);
        int a,i;
        do{
           System.out.println("donner un nombre entre 1 et 10:");
           a=SC.nextInt();
        }while((a>1)&(a>10));
        for(i=1;i<11;i++){
            System.out.println(a+"*"+i+"="+a*i);
        }



    }
}
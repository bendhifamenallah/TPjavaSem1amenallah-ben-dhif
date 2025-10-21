import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=0,a;
        int m;
        System.out.println("donner le moin");
        m=sc.nextInt();
        System.out.println("donner l'anneé");
        a=sc.nextInt();
        switch (m) {
            case 1,3,5,8,12 :
                j=31;
                break;
            case 4 ,6, 9, 11:
                j=30;
                break;
            case 2:
                if ((a%4==0 && a%100!=0) || (a%400==0) ){
                     j=29;
                }
                else{
                    j=28;
                }
            default:
            System.out.println("mois invalide");
                break;
        }
        System.out.println(" en "+a+" le moins n°  "+m+ " a " +j+" jours ");
        


        }
    }

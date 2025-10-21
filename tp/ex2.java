import java.util.Scanner;
public class ex2 {
    public  static int  lectureN(){
        Scanner sc = new Scanner(System.in);
    
       int n;
        do { 
            System.out.println("enter un entier positif :");
            n = sc.nextInt();
        } while (n<0);  
        return n;                  
    }
    public static int Compter(int n){
        int x=0;
        while (n!=0){
            n=n/10;
            x++;
        }
        return x;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++){
            int x =lectureN();
            int c = Compter(x);
            System.out.println("Le nombre " + x + " a " + c + " chiffres.");
        }
    }
}

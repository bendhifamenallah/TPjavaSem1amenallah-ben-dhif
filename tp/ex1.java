import java.util.Scanner;
public class ex1 {
   public  static int lectureN(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre entier: ");
       int n;
        do { 
            System.out.println("enter un entier positif :");
            n = sc.nextInt();
        } while (n<0);  
        return n;                  
    }
    public static boolean  EstPair(int n){
        if (n % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++){
            int x =lectureN();
        if (EstPair(x)==true){
            System.out.println("Le nombre " + x + " est pair");
        } 
       
        }
        
    }
}

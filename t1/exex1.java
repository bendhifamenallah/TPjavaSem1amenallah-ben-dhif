public class ex1 {
    public static void main(String[] args) {
        int a, b;
        a = 7;
        b = 18;
        System.out.println("a=" + a + "b=" + b);// a=7 b=18//
        a += b;
        System.out.println("a=" + a + "b=" + b);// a=25 b=18
        b -= 8;
        System.out.println("a=" + a + "b=" + b);// a=25 b=10
        a *= b;
        System.out.println("a=" + a + "b=" + b);// a=250 b=10
        a /= 2;
        a %= 2;
    }
}

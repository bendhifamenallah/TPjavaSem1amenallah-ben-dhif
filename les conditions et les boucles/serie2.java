public class serie2 {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("j");
        StringBuffer s2=s1;
        s1=s1.append("ava");
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
    }
}

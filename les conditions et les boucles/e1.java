public class e1 {
    public static void main(String[] args) {
        StringBuffer ch1=new StringBuffer("j");
        StringBuffer ch2=new StringBuffer();
        ch2=ch2.append("l");
        System.out.println("ch2="+ch2);
        StringBuffer ch_sb=ch1;
        ch1=ch1.append("ava");
        ch_sb=ch_sb.append("est sensible a la casse");
        System.out.println("contenu de ch_sb:"+ch_sb);
        System.out.println("contenu de ch1:"+ch1);
        boolean test=(ch_sb==ch1) ;
        if (test){
            System.out.println("ch_sb st ch1 pointent sur le meme onjet");
        }else{
            System.out.println("ch_sb st ch1 pointent sur des objet differant");
        }
        ch2=ch2.append("angage");
        System.out.println("ch2="+ch2);
        

    }
    
}

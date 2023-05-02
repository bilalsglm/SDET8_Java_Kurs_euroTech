package Day_28_Collection;

public class _3_StringPool {
    public static void main(String[] args) {

        String s1 ="Mustafa bey";
        String s2 ="Mustafa bey";
        String s3 ="Mustafa bey";

        String yenis =new String("Mustafa bey");

        if (s1==s2){
            System.out.println("Burada kablar kiyas edilir");
        }else {
            System.out.println("Kablar esit degil");
        }
        if (s2.equals(yenis)){
            System.out.println("Burada kablar icerisindeki degerler kiyaslar");
        }else {
            System.out.println("Degrler esit degil");
        }
    }
}

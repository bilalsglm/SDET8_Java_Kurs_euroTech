package Day_30_DateAndTime;

public class _4_SrtingLenght {
    public static void main(String[] args) {

        String str = "Java";
        String tex = "euro Tech Study";

        int x1 = str.length();//str objesinin karekter saisini verir uzunluk olarak
        System.out.println("x1 = "+x1);

        // lenght() , String class i icerisinde olan methoddur. uzunlugu hesaplar
        System.out.println("tex = " + tex.length());
        System.out.println(tex.length()*10);

        String name = new String("Gulden Hanim");
        int strUzunluk = name.length();
        System.out.println("NEW ile olusturulan nesnenin uzunlugu = "+strUzunluk);

    }
}

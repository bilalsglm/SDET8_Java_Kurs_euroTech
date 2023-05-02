package Day_39_ConstructorAndOOP.Constructor2;

public class Kitapci {
    public static void main(String[] args) {

        Kitap k1 =new Kitap("Fazil",1921,"cile");//Bir kitap objesi create ettik
        System.out.println(k1.toString());
        k1.name="sefiller";
        System.out.println(k1.toString());

        Kitap k2 =new Kitap("Javanin",2023,"Efendileri");
        System.out.println(k2.toString());

    }
}

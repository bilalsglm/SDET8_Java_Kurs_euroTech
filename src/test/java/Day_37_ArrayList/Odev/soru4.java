package Day_37_ArrayList.Odev;

import java.util.ArrayList;
import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        //Kullanıcıdan tüm ayları yazmasını isteyin, ardından sizin oluşturduğunuz bir Diziye ayların isimlerini yazınız.
         //Kullanıcıdan alınan ay isimlerinin doğruluğunu kontrol edin

        ArrayList<String> Aylar=new ArrayList<>();
        ArrayList<String> benimAylar=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen aylari yaziniz :");

        benimAylar.add("Ocak");
        benimAylar.add("Subat");
        benimAylar.add("Mart");
        benimAylar.add("Nisan");
        benimAylar.add("Mayis");
        benimAylar.add("Haziran");
        benimAylar.add("Temmuz");
        benimAylar.add("Agustos");
        benimAylar.add("Eylul");
        benimAylar.add("Ekim");
        benimAylar.add("Kasim");
        benimAylar.add("Aralik");

        Aylar.isEmpty();


    }
}

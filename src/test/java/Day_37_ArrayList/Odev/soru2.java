package Day_37_ArrayList.Odev;

import java.util.ArrayList;
import java.util.Arrays;

public class soru2 {
    public static void main(String[] args) {
        //Bir ArrayList oluşturun, haftanın günlerinin isimlerini atayınız.
        //Ardından haftasonu günlerinin tek tek listeden siliniz.

        ArrayList<String> haftaGunleri= new ArrayList<>(Arrays.asList("Pazartesi","Sali","Carsamba"
        ,"Persembe","Cuma","Cumartesi","Pazar"));

        System.out.println("Haftanin gunleri = "+haftaGunleri);

        haftaGunleri.remove("Cumartesi");
        haftaGunleri.remove("Pazar");
        System.out.println("haftaicinin Gunleri = " + haftaGunleri);



    }
}

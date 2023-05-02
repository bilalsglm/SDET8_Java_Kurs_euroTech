package Day_32_Arrays.Odev;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        //Kelimelerden en uzun olanının ilk harfini Büyük ise küçük; küçük ise büyük hale getiriniz.

        Scanner mtn =new Scanner(System.in);
        System.out.println("lutfen 5 kelime yaziniz :");

        String[] kelime = new String[5];
        for (int i = 0; i < 5; i++) {
            kelime[i]= mtn.next();

        }

        String enUzunKelime = kelime[0];
        for (int i = 0; i < 5; i++) {
            if(kelime[i].length()>enUzunKelime.length()){
                enUzunKelime=kelime[i];
            }
        }

        char ilkHarf = enUzunKelime.charAt(0);
        if(Character.isUpperCase(ilkHarf)){
            ilkHarf = Character.toLowerCase(ilkHarf);
        }else {
            ilkHarf = Character.toUpperCase(ilkHarf);
        }
        enUzunKelime=ilkHarf+enUzunKelime.substring(1);
        System.out.println("enUzunKelime = " + enUzunKelime);

    }
}

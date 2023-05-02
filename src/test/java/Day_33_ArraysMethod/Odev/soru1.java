package Day_33_ArraysMethod.Odev;

import java.util.Arrays;
import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
//        Kullanıcıdan alacağınız bir cümlenin her kelımesinin sadece ilk harflerini bir diziye atayınız.
//        Ardından her harfin tekrar sayısı ile birlikte yazdırınız


//        Scanner cumle =new Scanner(System.in);
//        System.out.println("Lutfen bir cumle yaziniz: ");
//        String kelime = cumle.nextLine();
//
//
//        String[] kelimeler= kelime.split(" ");
//        kelime.indexOf(0);
//
//        int tekrar=0;
//        for (int i = 0; i < kelimeler.length; i++) {
//            tekrar++;
//
//        }
//        System.out.println("Cumlenin kelimelrin ilk harleri = "+Arrays.toString(kelimeler)+tekrar+kelime);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");
        int[] harfSayilari = new int[kelimeler.length];

        for (int i = 0; i < kelimeler.length; i++) {
            String kelime = kelimeler[i];
            if (kelime.length() > 0) {
                char ilkHarf = kelime.charAt(0);
                harfSayilari[i] = 1;
                for (int j = i + 1; j < kelimeler.length; j++) {
                    if (kelime.equalsIgnoreCase(kelimeler[j])) {
                        harfSayilari[i]++;
                        kelimeler[j] = " ";
                    }
                }
                System.out.println("'" + ilkHarf + "' harfi " + harfSayilari[i] + " kez tekrar edildi.");
            }
        }


    }
}

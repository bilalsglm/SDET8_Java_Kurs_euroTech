package Day_27_Input.Odev;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        //Kullanici tarafindan girilen bir sayinin rakamlarinin toplamini veren programi yaziniz.
        // Ornegin kullanici tarafindan girilen 1234 --> 1+2+3+4=10 gibi (Bunu derste cozduk)
        // Simdi;
        // Eger rakamlarin toplami 9 dan kucuk ise tekrar sayi istesin !!!!

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        boolean hata = false;

        do {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            int kalan, rakam;
            kalan = sayi;
            while (kalan > 0) {
                rakam = kalan % 10;
                toplam += rakam;
                kalan /= 10;
            }

            if (toplam < 9) {
                System.out.println("Rakamların toplamı 9'dan küçük olduğu için tekrar bir sayı giriniz.");
                toplam = 0;
                hata = true;
            } else {
                System.out.println("Rakamların toplamı: " + toplam);
                hata = false;
            }

        } while (hata);

        scanner.close();
    }


}

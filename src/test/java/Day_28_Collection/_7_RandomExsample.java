package Day_28_Collection;

import java.util.Random;
import java.util.Scanner;

public class _7_RandomExsample {
    public static void main(String[] args) {
        // Kullanici tarafindan belirlenen sinir ile rastgele sayi(int) uretilsin ve ayrica kullanicidan sayi tahmin
        // alinsin. Esit olmasi durumunda tebrikler yazdirin

        Scanner sc= new Scanner(System.in);
        Random ra = new Random();

        System.out.println("Rastgele sayilar icin sinir belirleyiniz : ");
        int sinirSayisi = sc.nextInt();

        int uretilenSayi=ra.nextInt(sinirSayisi);// Burada boudry sayisi kullanicidan geldi
        // {0 ile kullanicinin verdigi deger arasinda rastgee gelecek deger ifade eder}


        System.out.println("Rastgele gelecek sayiyi tahmin ediniz : ");
        int tahminSayisi=sc.nextInt();


        if (uretilenSayi==tahminSayisi){
            System.out.println("Bravo Tebrikler");
        }else{
            System.out.println("uretilenSayi = " + uretilenSayi);
            System.out.println("Bilemedin ki , Bilemedin ki...");
        }

        // ternary ile yazilisi
        String sonuc= (uretilenSayi==uretilenSayi)? "Bravo Tebrikler" :"Bilemedin ki , Bilemedin ki...";
        System.out.println("sonuc = " + sonuc);
    }
}

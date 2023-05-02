package Day_28_Collection;

import java.util.Random;

public class _4_Rndom {
    public static void main(String[] args) {
        // random --> Rastgele sayi demek

        Random r= new Random();
        // INT degr atamasi icin
        int intRandom= r.nextInt();// bu int degeri olarak rastgele sayi atamak demektir
        System.out.println("intRandom = " + intRandom);

        // Double rastgele deger atamasi icin
        double doubleRandom = r.nextDouble();// Bu double degeri random olarak atamak demek
        System.out.println("doubleRandom = " + doubleRandom);// 0.0 dahil 1.0 degerine kadar deger atar.(1.0 dahil degil)

        int sinirliRandomSayi=r.nextInt(30);// 0 ile 30 degerler arasinda deger atamasi olur.30 dahil DEGIL!!!

        System.out.println("sinirliRandomSayi = " + sinirliRandomSayi);

        // Math class indan
        double randomDouble=Math.random()*10;// yine 0.0 ile 1.0 arasindaki sayiyi 10 ile carparak verir
        // random Math icerisinde static oldugu icin direkt NOKTA ile kullanilir
        System.out.println("randomDouble = " + randomDouble);


        // random degerleri 0 ile 1 arasinda uretiliyor
        // 0.0000, 0.0001, 0.100,.....0.99999 gibi degelerden uretiliyor

    }
}

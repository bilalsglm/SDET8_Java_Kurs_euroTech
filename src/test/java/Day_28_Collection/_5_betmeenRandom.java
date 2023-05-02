package Day_28_Collection;

import java.util.Random;

public class _5_betmeenRandom {
    public static void main(String[] args) {

        Random random=new Random();
        // Boundary
        int sayi = random.nextInt(6);

        ////////////////////////////////////////////
        // Between olmasi icin ARALIKLI DEGER ATAMA
     //   int arasindaBirDegerAtama= random.nextInt (Buyuk deger- Kucuk deger+1)+Kucuk deger;--> Dahil olan buyuk deger

        int max =12;
        int min =5;
        int araliliDEgerAlma=(int) (Math.random()*(max-min)+1)+min;// Buradaki random MATH class indan geliyor static oldugu icin

        System.out.println("realiliDEgerAlma = " + araliliDEgerAlma);

        // Math olmadan yazilma sekli
        int rastgele;// 12 ile 5 arasinda deger atama
        rastgele =random.nextInt(12-5+1)+5; //(Random islemi (max-min+1))+min
        // Burada random ise yukarida tanimladigimiz nesne den geliyor
        System.out.println("rastgele = " + rastgele);
/////////////////////////////////////////////////////

        // 30 ile 99 arasinda int rastgele deger uretiniz
        int betweenDeger=random.nextInt((99-30)+1)+30;
        System.out.println("betweenDeger = " + betweenDeger);

/////////////////////////////////////////////////
        //Boolean rastgele deger atama sekli
        boolean booleanRandom=random.nextBoolean();// iki deger alabilior TRUE veya FALSE
        System.out.println("booleanRandom = " + booleanRandom);

    }

}

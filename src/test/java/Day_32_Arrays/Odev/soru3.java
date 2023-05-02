package Day_32_Arrays.Odev;

import java.util.Random;

public class soru3 {
    public static void main(String[] args) {
        //Oluşturulan 10 elementli int dizisine 50 ile 100 arasında Random
        // değerler atayarak elementlerin değerlerini atayınız. Bu degerleri foreach ile yazdırınız



        int [] sayi = new int[10];
        Random rastGeleSayi = new Random();

        for (int i = 0; i < sayi.length; i++) {
            sayi [i]= rastGeleSayi.nextInt(51)+50;
            //sayi[i] = (int) (Math.random()*50)+50;

        }
        for (int num:sayi) {
            System.out.println(num);
        }

    }
}

package Day_28_Collection.Odev;

import java.util.Random;
import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        //50 ile 99 sayilari arasinda (99 DAHIL) rastgele bir TEK sayi Degeri veren
        // ciktisini veren programi method ile yaziniz
        Scanner sayi = new Scanner(System.in);
        System.out.print("Lutfen bir tahmin yaziniz :");

        tahmin();



    }

    public static void tahmin (){





        Random random = new Random();
        int  tahminEt=random.nextInt((100-50)+1)+50;





    }

}

package Day_33_ArraysMethod.Odev;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
       // Kullanıcnın gireceği 20 sayıyı bir diziye atınız.
        //Sonra,girilen sayıların kaç tanesi kendisinden önce girilen sayıdan büyük olduğunu bulunuz ?
        //Mesela; 3,4,67,5,33,23,657,3,6,7,8,11,8,45,22,19,15,11,5,1
        //        ----> 9 kez kendisinden büyük sayı girilmiştir.

        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[20];
        int buyukSayiSayisi = 0;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i+1) + ". sayıyı giriniz: ");
            sayilar[i] = scanner.nextInt();

            for (int j = 0; j < i; j++) {
                if (sayilar[i] > sayilar[j]) {
                    buyukSayiSayisi++;
                }
            }
        }

        System.out.println("Girilen sayılardan kendisinden önce girilen sayılardan " + buyukSayiSayisi + " tanesi büyüktür.");

    }

}
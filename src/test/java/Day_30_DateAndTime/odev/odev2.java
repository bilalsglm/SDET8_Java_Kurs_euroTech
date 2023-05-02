package Day_30_DateAndTime.odev;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        // Kullanıcıdan tek okumada alacağınız 2 kelimelik ad ve soyadı ekrana sadece isim başHarf.soysimBasharf.
        // şeklinde yazdırınız.
        //yani Ahmet Yılmaz -> A.Y. olarak yazdırınız.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Adiniz ve Soyadiniz :");
        String adSoyad = scanner.nextLine();
//        String tamAdSoyad ="";
//
//        for (int i = 0; i < adSoyad.length(); i++) {
//            char c = adSoyad.charAt(i);
//            if(i==0){
//                    tamAdSoyad+= String.valueOf(c).toUpperCase();
//            } else if (adSoyad.charAt(i-1)== ' ') {
//                tamAdSoyad += "." + String.valueOf(c).toUpperCase();
//            }
//        }

//        System.out.println("İsim baş harf ve soyisim baş harf: "+tamAdSoyad );

        int ilkBoslukIndex=adSoyad.indexOf(" ");
        int ikinciBoslukIndex=adSoyad.indexOf(" ",ilkBoslukIndex+1);

        System.out.println(" isim bas harf ve soyisim basharf = "+adSoyad.charAt(0)+"."+adSoyad.charAt(ilkBoslukIndex+1)+
                "."+adSoyad.charAt(ikinciBoslukIndex+1)+".");
   }
}

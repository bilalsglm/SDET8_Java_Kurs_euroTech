package Day_57_Error_Exeption_01;

import java.util.Scanner;

public class _07_TryCatchExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Hatanin olma ihtimali olan kodlar bu bolcta yer alir

        try {
            System.out.println("1. Sayiyi Giriniz :");
            int sayi1= sc.nextInt();
            System.out.println("2. Sayiyi Giriniz :");
            int sayi2= sc.nextInt();

            int bolum =sayi1/sayi2;
            System.out.println("Bolum : "+bolum);
        }
        //Hata  olma durumunda calisacak bolum
        catch (Exception hata){

            System.out.println("Hata oldu");
            System.out.println("e.getMessage() = " + hata.getMessage());
            hata.printStackTrace();// printStackTrace() method, consolda hata oldugunda
                                  // yazdirilan kirmizi detaylarlari yazdirmaya yariyor
        }
    }
}

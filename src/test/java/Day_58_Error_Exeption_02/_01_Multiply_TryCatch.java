package Day_58_Error_Exeption_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01_Multiply_TryCatch {

    public static void main(String[] args) {
        //kullanici 5 kez 2 ser adet sayi alip bolum sonucunu ekrana yazdirsin
        //olusabilicek tum hatalari try-catch ile hanle etsek
        //hata olusursa yerine sayi istesin


        for (int i = 0; i < 3 ; i++) {
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("1.sayiyi giriniz : ");
                int sayi1= sc.nextInt();

                System.out.println("2.sayiyi giriniz : ");
                int sayi2= sc.nextInt();

                int bolum=sayi1/sayi2;
                System.out.println("Kullanicidan alinan 2 sayinin bolum degeri = "+bolum);
            }catch (ArithmeticException ex){
                System.out.println("2. sayiyi sifir olarak girmeyiniz");
                i--;
            }catch (InputMismatchException ex){
                System.out.println("Lutfen sayiyi giriniz");
                i--;




            }

        }


    }
}

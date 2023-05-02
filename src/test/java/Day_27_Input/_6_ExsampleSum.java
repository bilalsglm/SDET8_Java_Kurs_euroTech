package Day_27_Input;

import java.util.Scanner;

public class _6_ExsampleSum {
    public static void main(String[] args) {
        // Kullanici tarafindan girilen bir sayinin rakamlarinin toplamini veren programi yaziniz
        // prnegin klavyeden girilen 1234---> 1+2+3+4=10 gibi
        // Method kullaniniz

        int sonuc = rakamlarinToplami();
        System.out.println("Girilen sayinin rakamlarinin toplami = "+sonuc);
        

    }

    public static int rakamlarinToplami(){
        int sayi;
        Scanner scanner =new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz : ");
        sayi=scanner.nextInt();
        // algoritma kuralim
        // 1234 bu sayinin rakamlarini alma yontemi --> 10 a modunu alip birler basamagini alma yontemi

        int rakam=0;
        int rakamToplam=0;

        while (sayi!=0){
            rakam=sayi%10;// 10 a bolumunden kalan veya rakam alma bicimi
            rakamToplam=rakam+rakamToplam;//rakamToplam+=rakamToplam;
            sayi/=10;// sayi= sayi/10;
        }
        return rakamToplam;

    }

}

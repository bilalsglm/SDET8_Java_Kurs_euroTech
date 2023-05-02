package Day_31_StringMethod.Odev;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        //Kullanici tarafindan girilen bir String in son iki karakterinin yine ayni string
        // icerisinde tekrar sayisi ile birlikte bulan programi yaziniz.

        Scanner str=new Scanner(System.in);
        System.out.println("Lütfen bir metin yaziniz");
        String text=str.nextLine();

        String sonIkiKrk=text.substring(text.length()-2,text.length());
        System.out.println("sonIkiKrk = " + sonIkiKrk);

        int tekrar=0;
        for (int i = 0; i < text.length()-1; i++) {
            if (sonIkiKrk.equals(text.substring(i,i+2))) {
                tekrar++;
            }
        }  System.out.println(text+" icerisinde " +sonIkiKrk +" "+ tekrar+" defa tekrar etmistir");
    }
}

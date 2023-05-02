package Day_27_Input.Odev;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
   // Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner scr = new Scanner(System.in);
        System.out.println("Lutfen bir karekter yaziniz : ");

        char karekter = scr.next().charAt(0);


        if ( karekter== 'x'){
            System.out.println("Program bitti.");
        }else
            System.out.println("Program calisiyor.");

    }
}

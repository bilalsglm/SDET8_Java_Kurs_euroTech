package Day_32_Arrays.Odev;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        //Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz

        Scanner cumle = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz =");
        String kacKelime=cumle.nextLine();

        int bosluk = kacKelime.indexOf(" ");
        System.out.println("Cumle "+(bosluk+1)+" kelimedir.");



    }
}

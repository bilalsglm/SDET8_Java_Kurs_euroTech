package Day_27_Input;

import java.util.Scanner;

public class _5_Exsample {
    public static void main(String[] args) {
        // kullnicidan Cadde, sokak, postacode(int) ve ulkr bilgilerini isteyip yazdiriniz

        Scanner oku = new Scanner(System.in);

        System.out.print("Lutfen cadde bilgisini yaziniz : ");
        String cadde= oku.nextLine();

        System.out.print("Lutfen sokak bilgidisni yaziniz : ");
        String sokak = oku.nextLine();

        System.out.print("Lutfen postakotu bilgisi giriniz : ");
        int postakodu = oku.nextInt();

        oku.nextLine();// int den Stringe gecerken alinan hatayi ortadan kaldirir.
        System.out.print("Lutfen ulke bilgisini yaziniz : ");
        String ulke = oku.nextLine();

        System.out.print("Adres Bilgisi = "+cadde+","+sokak+","+postakodu+","+ulke);



    }
}

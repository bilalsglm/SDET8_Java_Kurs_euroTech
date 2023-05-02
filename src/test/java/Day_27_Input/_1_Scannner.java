package Day_27_Input;

import java.util.Scanner;// predefind olan bu class ihtiyac halinde cagrilarak calisir
                        // import edilen bir class oldugu icin class disinda ve genellikle en ustte yer alir

import java.util.*;// Eger import edilecek olan classalrin tamamini tanimlamak isterseniz

public class _1_Scannner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Klavyeyi tanimladik
        // kullanici tarafindan bilgi girilmesini sagladik

        System.out.print("Lutfen bir byte verisi giriniz : ");
        byte scannerByte=scanner.nextByte();//Byte olan bir veri girilmesi icin sisteme byte tanimladik
        System.out.println("scannerByte = " + scannerByte);

        System.out.print("Lutfen bir short verisi giriniz : ");
        short scannerShor =scanner.nextShort();
        System.out.println("scannerShor = " + scannerShor);

        System.out.print("Lutfen bir int verisi giriniz : ");
        int scannerInt =scanner.nextInt();
        System.out.println("scannerInt = " + scannerInt);

        System.out.print("Lutfen bir double verisi giriniz : ");
        double scannerDouble=scanner.nextDouble();
        System.out.println("scannerDouble = " + scannerDouble);

        System.out.print("Lutfen bir boolean verisi giriniz : ");
        boolean scannerBlooean =scanner.nextBoolean();
        System.out.println("scannerBlooean = " + scannerBlooean);

    }
}

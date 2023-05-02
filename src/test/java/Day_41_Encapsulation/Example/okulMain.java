package Day_41_Encapsulation.Example;

import java.util.Scanner;

public class okulMain {

    public static void main(String[] args) {

       // Ogrenci ogr=new Ogrenci();
        Okul okul1=new Okul();

        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("Maksimum ogrenci sayisini giriniz : ");
        int sayi= sc.nextInt();
        okul1.setMaxOgrenciSayisi(sayi);

        int sayac=1;
        do {
            System.out.println("Ogrenci adini giriniz : ");
            String ogrAd=sc2.nextLine();

            System.out.println("Ogrenci adini giriniz : ");
            String ogrsoyAd=sc2.nextLine();

            System.out.println("Ogrenci yasinizi giriniz : ");
            int ogryas=sc.nextInt();

            Ogrenci ogr =new Ogrenci(ogrAd,ogrsoyAd,ogryas);

            if(ogryas<=15){
                okul1.getOgrenciler().add(ogr);//Burada bir ogrencinin listesine eklemesini yaptik
                sayac++;
            }

        }while (sayac<= okul1.getMaxOgrenciSayisi());


    }

}

package Day_08_JavaAssigneOperators;

public class _2_ExsampleAssigment {

    public static void main(String[] args) {

        int rakam =2;// bu degei artirmak istiyorum

        rakam = rakam+1;// bu sekilde bir artilabilir

        System.out.println("rakam = " + (rakam+1)); // bu sekilde 1 artirabilir

        System.out.println("rakam = " + rakam++);// bu sekilde 1 artirabilir.FAKAT

        rakam++;
        System.out.println("rakam = " + rakam);

        // ONCESINDE --> POST

        int sayi= 1;
        //sayi++;
        System.out.println("sayi = " + sayi++);// Burada sayi okunduktan yani yazdirildiktan sonra artti ve 2 degerine ulasti

        // SONRASINDA --> PRE

        //++sayi;
        System.out.println("sayi = " + ++sayi);// Burada once sayiyi bir arttirdi ve sonrasinda yazdirdi.3 degerini yazdirdi

       int sayac =5;
       sayac++;
       sayac = sayac+1;

       // Bu sekilde sayac bir artiriliabilir

        // NEGATIF olarak

        sayac--;
        sayac=sayac-1;

        // sayac degerinde bir azaltma yontemleridir
        // ONEMLI --> sayinin ne zaman artirimi gerceklestirdigi cok onemlidir.
        // cunku sayi oncesinde veya sonrasinda bu UNARY artirma veya azaltma yapilabiliyor.

        ++sayac;
        --sayac;

    }

}

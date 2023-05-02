package Day_06_DateTypeAndConcat;

public class _5_finalKeyWord {
    public static void main(String[] args) {

        double pi=3.14;
        System.out.println("pi = " + pi);
        int idNumer;
        idNumer= 12345;
        pi=12.6;// onceki deger bu satira geldiginde degistirir
        System.out.println("pi = " + pi);

        // FAKAT pi degeri degismemesini istiyoruz
        // bunun Java FINAL keyword gelistirmis

        final double pi1=3.14;
        //pi1= 13.9;

        // Burada degiskenler farkliolabilir, Boolean,int, double

        final int idNumer1 =123456;
        // idNumer1 123456; --> final olarak belirlenen bir degisken yeni deger atamaz

    }
}

package Day_05_DateType;

public class _1_DateType {
    public static void main(String[] args) { // Main methodu. susulu parentez icinde yer alan hersey methoda ait.

        boolean ogrenciMisin;// benim bir ogrenciMisin diye bir degiskenim var ve bu degisken iki cevapli boolean degiskenidir

        ogrenciMisin = true;

        // byte days=128; --> Date Type alabilicgi degerin fazlasini verdin ben bunu tasiyamam
        byte yas = 102;
        System.out.println("Hello World");// sabit bir icerik yazdiriliyor.
        System.out.println("Bireyin Yasi= ");
        System.out.println("Bireyin Yasi= " + yas);// sabit ile birlikte dinamik bir deger var burada
        yas = 103;
        System.out.println(yas);// Burada sadece yasi yazdirir.***Yas son atanan degeri yazdi
        // bir degisken olusturulduktan sonra en son atanan deger degiskenin degeri oluyor
        // Bu atamada onceki deger kaybolur. Eger ayni isimle degisken kullnirsak
        yas = 111;// artik yas bu satir okunduktan sonra 111 olarak degisir

        //***byte yas=112;// eger bir degiskenin type belli olduktan sonra ayni degisken icin type yizilmz

        /*
        Boolean degisken disinda diger premitive types sifir degeri alir DEFAULT olarak
        Boolean degeri default olarak FALSE dir

         */
        double taxRate = 12.5;

        double tax1;
        // Degiskenlere dair bir tanimlama;
        // System.out.println(tax1); // Burda degiskeni method icinde tanimladiginiz icin bir deger atamalisiniz.
                                 // yoksa hata veirir.

        System.out.println("Benim vergi oranim =" + taxRate);
        // double taxRate= 13; --> Buradaki hata degisken tanimladiktan sonra tekrar yazilmaz.

        taxRate = 15;
        System.out.println("Benim vergi oranim  =" + taxRate);

        //cift trinak icnde verilen bosluk kullanilmakta FAKAT cift tirnak disinda kod yazarken olusturulan bosluklar okunmaz
        //Bir double degere tam sayi atayabiliriz olusturululan bir degiskene 15 degeri 15.0 olarak yazilir
        //NEDEN ? cunku bu oran ifade etmektedir. yani kabimiz Double

        int ogrNo = 12124;
        System.out.println("ogrenci numaram =" + ogrNo);// cift tirnak icindeki sabit, sonrasi dinamik.

        ogrNo = 34223;
        System.out.println("ogrenci numaram =" + ogrNo);

        int ogrNo1=896586;

        int kazanc; // DEFAULT seklinde degiskenin tanimlmasi ve int default degeri "0"dir.

        // Degiskenlere dair bir tanimlama;
        // System.out.println(kazanc);// Burda degiskeni method icinde tanimladiginiz icin bir deger atamalisiniz.
        // yoksa hata veirir.

        int sayi;
        sayi=231;
        System.out.println("Benim Ovari Degerim = " +sayi);

    }// --> bu parentez Main methoduna ait suslu parentez.

}// --> bu parentez class a ait


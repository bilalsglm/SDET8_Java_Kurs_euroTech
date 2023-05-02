package Day_20_BranchingExample;

public class _6_returnMethod {
    public static void main(String[] args) {

        // Method un Kullanimi
        // MAin icerinde method sadece adi ile cagirilir
        merhaba();//Merhaba methodunu cagirdim
        // Kosmasi sonucu icindekini yazar
        // yaslarinToplama()-->Parametreli yazilan bir fonksiyon, parametre sayisinca deger atamasi beklenir
        // S
        System.out.println("Yaslar Toplami = "+yaslarinToplama(15,33,45));

    }
    // METHOD veya FONKSIYON

    // Parametresiz bir method yazdik
    //Methodun adi : toplama
    public static void toplama(){
    }
    // Method bir is veya islemlerin icerisinde birindiran fonksiyondur
    // Main de bir methodtur
    // Merhod sonsuz parantez ile CLASS icerinde yazilir

    // Burada bir method yazdik.Adi:merhaba, icerisinde sadece "Hello World" yazdirma islemi yapar
    public static void merhaba(){
        System.out.println("Hello World");
    }

    // Burada degiskenler tanimladim. Sonrasinda toplam degerini yazdirdim.PARAMETRESIZ

    // SAbit
    public static void sum(){
        int sayi1 =12;
        int sayi2=5;
        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);

    }
    // PARAMETRE METHOD
    // Uc kisi icin verilen yaslarin toplami isteniyor
    // uc parametreli method yazdik
    public static int yaslarinToplama(int yas1,int yas2,int yas3){// ismin devamindaki degiskenleri tanimlama durumu
                                                            // PARAMETRE li methoddur
        // Belirlenen parametreler kullanilmasi beklenir.
        int result =yas1+yas2+yas3;

        return result; // RETURN bir fonksiyon methodicerisindeki islemlerin sonucu method cagrilinca veren KEYWORD
                        // Genellikle en sonda yazilir
    }
    // yaslarin toplami methodunda dinamik bir durum olusturduk
    // yaslar verlilince bize toplami verecek bir fonksiyon yazdik


}


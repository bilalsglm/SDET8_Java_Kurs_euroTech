package Day_06_DateTypeAndConcat;

public class _2_Characters {
    public static void main(String[] args) {
         // CHAR --> Universal code = Unicode olarak karekterleri tanimlanmistir

        char sembol = 'A'; // char degiskeni tek tirnak icersinde tek harf barindirir
        char sembol1 = 'a'; // A ile a ayni degeri ifade ETMEZ

        // Decimal olarak

        char sembol2 = 65;// burada decimal deger olarak algilar yani buyuk A dir
        System.out.println("sembol2 = " + sembol2);

        char sembol3= 97;//decimal olarak a degeri ifade eder

        char hrf1= 73;
        System.out.println(hrf1);
        char hrf2=83;
        System.out.println(hrf2);
        System.out.println(hrf1+hrf2);

        // unicode seklinde yazilimi
        char sembilUnicode = 0*0056;
        System.out.println(sembilUnicode);

        char harf = 87;// ya decimal deger veya TEK tirnak icinde HARF yazilabilir
        double oran = 87;//sayisal deger olarak oran algilar int de yazsaniz ondalik devamini da verir
        int sayi= 87;// 10 basamakli degerleri alabilen TAM sayilardir
        String deger = "87";// cift tirnak iceriisnde tum unicode ile karekterleri yazilabilen bir kab olusturur

        System.out.println("harf = " + harf);
        System.out.println("oran = " + oran);
        System.out.println("sayi = " + sayi);
        System.out.println("deger = " + deger);

        //Concat ile yani birlestirme ile dort ayri

    }
}

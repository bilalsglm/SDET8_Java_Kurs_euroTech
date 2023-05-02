package Day_11_Java_Logical_Operators;

public class _1_Exsample {
    public static void main(String[] args) {
        int sayi=1;
        sayi++;

        System.out.println("sayi = " + sayi++);// burada sayi 2 yazdirilir satir bitiminde sayi 3 olur.
        // yazdirilcak sayinin sonrasina ekleme yapildi ise, yazdirma sonrasi sayinin degeri degisir.
        System.out.println("sayi = " + +sayi);// Burda sayi=3
        System.out.println("sayi = " + ++sayi);// eger syinin onunde ++ veya--varsa , yazdirma isleminden
                                                // ince islem yapilir ve sonrasinda yazdirilir.



    }
}

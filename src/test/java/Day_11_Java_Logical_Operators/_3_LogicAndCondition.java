package Day_11_Java_Logical_Operators;

public class _3_LogicAndCondition {
    public static void main(String[] args) {

        // bizim okula 3 yasinda buyuk ve 15 yasinda kucuk olanlari kaydediyoruz

        // ogr>= --> ogrenci 3 yasinda veya daha buyuk
        // ogr<= --> ogrenci 15 yasinda veya daha kucuk

        // (ogr>=3 && ogr<=15)--> Return --> Boolean -->TRUE or FALSE
        // ogrenci 3 yasaindan buyuk ve 15 yasindan kucuk mu --> Boolean

        // Her iki sarti saglama ve daha fazla sart saglamasi durumunu kontrol etmek icin kullnilir

        //(sayi ==3 && sayi ==5 && sayi==7 && sayi==2) Rakam olarak asal bir sayi olma durumu ifade eder

        // EXAMPLE

        int x;
        x=6;
        System.out.println(x<5 && x<10); //FALSE --> bir sarti saglamiyor x=6 icin

        // VEYA isareti

        // "||" --> veya sartini saglayan operator dik iki cizgi ile ifade eder

        x=7;

        System.out.println(x<5 || x<10); // OR yani VEYA durumunda sartlarin biri saglanmasi ile TRUE doner
        // FALSE olmasi icin tum sartlarin saglanmiyor olmasi gerekir

        x=3;
        System.out.println(x<=100 || x>=15 || x==3); //TRUE
        System.out.println(x<=100 || x>=15 && x==4); //FALSE

        x=35;
        System.out.println(x<20 || x<=12 || x>15 && x==35);
    }
}

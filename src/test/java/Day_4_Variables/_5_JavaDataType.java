package Day_4_Variables;

public class _5_JavaDataType {
    public static void main(String[] args) {
         boolean evliMisin=true; // true veya false cevabi olan degiskenler icin kullanilir
        // Defualt olarak FALSE doner

        boolean evliMisin1;// cevabi FALSE dir. vArsayilan deger diyebiliriz.
        boolean ogrenciMIsin; // cevabi evet veya hayir dir
        byte month= 5; // kucuk degerleri (-128 ile +127 degerleri icin)
        // Default degeri olarak 0 alir

        short dateForDays= 18;

        // Byte den buyuk ancak 3 rakamli bir rakamlari yazmak icin kullanilir
        // (-32, 768 ile +32 , 767 arasindaki degerleri ifade eder. Default degeri olarak 0 alir

        char nameOffirstCharacter='A'; // TEK tirnak isareti ile character ifade edilir

        int degeri = 876543;// --> Default degeri olarak 0 alir

        long buyukDeger= 345678765L;//sonuna L ekleyerek integer olan bir degerin long oldugunu belirdir

        double taxRate = 12.6;// kusurlu sayilar ifade icin kullanilir

        byte minByteDegeri=Byte.MIN_VALUE;
        byte maxByteDegeri=Byte.MAX_VALUE;

        short minShortDegeri=Short.MIN_VALUE;
        short maxShortDegeri=Short.MAX_VALUE;

    }
}

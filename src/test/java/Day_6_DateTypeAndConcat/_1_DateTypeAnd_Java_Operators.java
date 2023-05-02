package Day_6_DateTypeAndConcat;

public class _1_DateTypeAnd_Java_Operators {
    public static void main(String[] args) {

        // Concat --> Birlestirme

        String satir1= "dusunmek";
        String satir2=" en buyuk ";

        String siirinTamami = satir1+satir2;
        System.out.println("siirinTamami = " + siirinTamami);

        String satir3= "armaganidir";

        siirinTamami= satir1+satir2+satir3;
        System.out.println("siirinTamami = " + siirinTamami);

        String satir4=" insanin ";
        siirinTamami= satir1+satir2+satir3+satir4;
        System.out.println("siirinTamami = " + siirinTamami);

        System.out.println(5);
        int sai=11;
        int sayi1=2;
        int sayi2=5;
        int toplam = sayi1+sayi2;
        System.out.println("toplam = " + toplam);

        String tanim= "Benim Yasim = ";
        int yas= 35;
        System.out.println(tanim+yas);

        int yas1= 40;
        String name="Bilal";
        System.out.println("Benim adim = "+ name+" ve Yasim = "+yas1);
    }
}

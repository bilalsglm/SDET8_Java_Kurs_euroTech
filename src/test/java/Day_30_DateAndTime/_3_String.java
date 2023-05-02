package Day_30_DateAndTime;

public class _3_String {
    public static void main(String[] args) {
        // Bu sekilde obje veya nesne creat edilebilir
        String name = "Ramazan";

        // Bir de yeni bir nesne olusturma icin
        String lastName= new String("Ogretmis");
        // NEW kelimesi kullnilip bir STRING nesnesi olusturulup onceden tanimlanmis bir deger alsa dahi farkli bir
        // NESNE ile tanimlanir. Onceden tanimlanmis nesneye esitlemez. YENI OBJE her sartta !!!!

        String s1 ="Bilal";
        String s2 ="Bilal";
        String s3 = "Ismail";
        String s4 = new String("Ismail");
        String s5 = new String("Bilal");


        // == objeleri kiyasliyor
        if(s1==s2){
            System.out.println("Bilal olarak yazdigimiz Objeler String Class i icerisinde ayni Objeye ESIT");
            System.out.println("Yani s2 s1 degerine esit oldugu icin sadece s1 objesine esitlenir");
        } else {
            System.out.println("s1 ile s2 degerleri farkli");
        }

        if(s1==s5){
            System.out.println("Objeler esit,yani ayni degeri ifade eden objeyi tanimlar");
        }else {
            System.out.println("degrleri ayni olsada FARKLI OBJELER temsil eder");
        }

        if(s3.equals(s4)){
            System.out.println("Objelerin degerileri birbirine esit oldugunu bize gosteriyor");
            System.out.println("Burada Objlerin DEGIL objenin degeri KIYASLANDI, EQUALS ile yaptik");
        }


    }
}

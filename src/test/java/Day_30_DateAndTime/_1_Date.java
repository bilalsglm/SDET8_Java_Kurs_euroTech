package Day_30_DateAndTime;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class _1_Date {
    public static void main(String[] args) {
        // Date ve Time --> Zaman tanimlama icin kullanilan DAte ve LocalDAte in kullnimi

        Date date=new Date();
        System.out.println(date);
        // Ayni Scanner da kullnilan System.in gibi sizin bilgisayardaki bilgileri okur

        LocalDate tarih= LocalDate.now();

        System.out.println("tarih = "+tarih);
        System.out.println(" tarih.getYear() ="+tarih.getYear());
        System.out.println("tarih.getDAyOfMonth() ="+tarih.getDayOfMonth());
        System.out.println("tarih.getMonth() = "+tarih.getMonth());
        System.out.println("tarih.getDayOfWeek() ="+tarih.getDayOfWeek());

        // Hazir bazi methodlar kullnilanilir, asagidaki gibi
        tarih.format(DateTimeFormatter.ISO_DATE);
        // Format icine kendi hazirladigimin formati yazsam ve yazdirsam

        DateTimeFormatter ozelFormat =DateTimeFormatter.ofPattern("dd/MM/yyy");

        System.out.println("ozel format = "+tarih.format(ozelFormat));


    }
}

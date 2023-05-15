package Day_57_Error_Exeption_01;

import java.time.LocalDate;
import java.time.Month;

public class _04_TryCatch {
    public static void main(String[] args) {
        System.out.println("Program basladi");

        try {
            System.out.println("Tarih set edliyor ");
            LocalDate date=LocalDate.of(2023, Month.MAY,40);
        }catch (Exception e){
            System.out.println("Verilen tarih degerlerini kontrol ediniz");
            System.out.println("Ay icin 1-31 arasinda deger alabilir");

            //Exaption classindan olusan obje ile hatanin mesajini almamizi sagliyor
            System.out.println("e.getMessage() = " + e.getMessage());//hatanin mesaji
        }
    }
}

package Day_12_ifStatement;

public class _1_ifStatement1 {
    public static void main(String[] args) {
        /*
        if kucuk harfle yazilir.IF olarak yazamayiz
        if (boolean-expression--> True or False {
        statement(s); Kosul saglanmasi durumunda yapilacakalri ifade eder.
        }
       */

        int sayi=-1;
        int sayi2=3;

        if (sayi2>0){
            System.out.println("Sayi pozitiftir ");
        }

        String name ="ismail";
        String name2="ismail";
        // iki adet String degeri ayni ve farkli degisken isimleri ile tanimlanmistir
        // bu degerler esit olup olmmmama durumu nasil kontrol ederiz

        //***** equals  Esit mi kosulu veya degerlendirme bicimini ifade eder

        if (name.equals(name2)){ // name min name2 ye esit olup olmadigini kontrol eder.
            System.out.println("isimler bir birine esittir.");

        }
        int num1=5;
        int num2=5;
        if(num1==num2){
            System.out.println("Sayilar bir birine esittir.");

        }
    }
}


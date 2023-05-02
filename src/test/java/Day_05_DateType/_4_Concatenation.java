package Day_05_DateType;

public class _4_Concatenation {
    public static void main(String[] args) {

        // Srting degirkeni tanimlama
        // Birlestirme

        String name="Ismet";
        // String bizim degisken TYPE
        // name --> (Degisken ismi)
        // "ismet" string degeri

        System.out.println("Hello World");// String bir deger yasdirmistik

        System.out.println("name= "+ name);


        String firstNAme="ismet";// bir string degisken atadaik

        String lasName;// Decleration seklinde degisken atadik

        lasName="Gunes";

        System.out.println("Benim adim soyadim= "+ firstNAme+ " "+lasName);

        // TODO : String tanim=" "; // String degeri icin sadece cift tirnak
        // String degiskeninde cift tirnak icinde tum karekterler yer alir.

        String merhaba ="Hello";
        String dunya =" World";
        String bosluk1=" ";
        String merhabaDunya= merhaba+bosluk1+dunya;
        System.out.println("merhabaDunya = " + merhabaDunya);

        firstNAme="ismail";
        String bosluk=" ";
        lasName="kormaz";

        String fullName=firstNAme+bosluk+lasName;
        System.out.println("fullName = " + fullName);

        String siir = "dusunmek en buyuk armaganidir insanin";
        // secili olan bir String degerini secip cif tirnak ile kolayca string degerine donusturebilirsiniz

        // TODO: TASK : Benim siirim : siirin tamami ve yazar
        /*
        Burada Benimsiirim kelimesi sabit. siir ve kendisi degisken. dir sabit
        dusunmek en buyuk armaganidir insanin , yazar :I.G.
         */
        String siir1= "Dusunmek en buyuk armaganidir insanin";
        String yazar= "yazar:"+"I.G."+"\'dir"; 
        String benimSiirim= siir1+","+yazar;
        System.out.println("benimSiirim = " + benimSiirim);
    }
}

package Day_31_StringMethod;

public class _4_StringIndexOf {
    public static void main(String[] args) {

        // Bir String iceriisndeki baska bir stringi arar ve INDEX ini verir.Referans baslangic noktasidir.
        String cumle="githobbies";
        // index in SIFIR dan basladigini untmainiz

        System.out.println(cumle.indexOf("h"));// Burada h karakterinin sol bastan baslayarak ilk buldugu yerdeki indexi verir
        System.out.println(cumle.indexOf("hub"));//Burda hub stringini sol bastan arar ve vuldugu ilk hub in ilk harf indexini veiri

        System.out.println(cumle.indexOf("hobbies"));

        System.out.println(cumle.indexOf("h",4));

        String liste = "Java-javascrpt-c++-Python-PHP";

        int ilkTireIsaretiIndex =liste.indexOf("-");
        System.out.println("ilk Tire Isareti Index= "+ilkTireIsaretiIndex);

        int ikinciTireIsaretiIndex=liste.indexOf("-",ilkTireIsaretiIndex+1);
        System.out.println("ikinci tire isareti index = "+ikinciTireIsaretiIndex);

        int ucuncuTireIsaretiIndex = liste.indexOf("-",ikinciTireIsaretiIndex+1);
        System.out.println("ucuncuTireIsaretiIndex ="+ucuncuTireIsaretiIndex);

        int dorduncuTireIsaretiIndex = liste.indexOf("-",ucuncuTireIsaretiIndex+1);
        System.out.println("dorduncuTireIsaretiIndex ="+dorduncuTireIsaretiIndex);

        //Contains ve indexOf ile aratma ve karsilastirma

        // Contains
        if(liste.contains("Java")){
            System.out.println("java kelimesi liste stringinde yer almaktadir.");
        }else {
            System.out.println("java kelimesi liste stringinde yer almamaktadir.");
        }

        // indexOf ile ani soru cozelim
        // indexOf da -1 degeri FALSE demektir
        if(liste.indexOf("-")>-1){// Burada if icerisinde dgerlendirme boolean expression oldugu icin,true ise var demek
            System.out.println("java kelimesi liste stringinde yer almaktadir.");
        }else {
            System.out.println("java kelimesi liste stringinde yer almamaktadir.");
        }
    }
}

package Day_30_DateAndTime;

public class _6_StringCharAt {
    public static void main(String[] args) {

        String str= "Apple";
        char ilkHarf=str.charAt(0);

        if (ilkHarf=='A'){
            System.out.println("A ilk karakterdir. ");
        }else {
            System.out.println("A ilk karakterdegildir.");
        }


        String myCar="civic";
        if(myCar.charAt(0)==myCar.charAt(4)){
            System.out.println("ilk ve son karakterler aynidir.");
        }else {
            System.out.println("ilk ve son karakterler ayni degildir.");
        }

        String word1= "Java Script";
        // Bu Stringin ilk ve son karakterleri ayni mi?
        char ilkKarakter=word1.charAt(0);
        System.out.println(ilkKarakter);
        char sonKarakter=word1.charAt(word1.length()-1);// Burada lenght() 1 den basladigi icin -1 oldugunda
        System.out.println(sonKarakter);                //SON karakteri alabiliriz


        if (ilkKarakter==sonKarakter){
            System.out.println("word1 in ilk ve son karakterleri esittir");
        }else{
            System.out.println("word1 in ilk ve son karakterleri esit DEGILDIR");
        }

        // word1 in uzunlugu
        System.out.println("word1 in uzunlugu : "+word1.length());
        System.out.println("word1 in son karakteri icin index "+(word1.length()-1));

    }
}

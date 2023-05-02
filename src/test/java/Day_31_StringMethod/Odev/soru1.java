package Day_31_StringMethod.Odev;

public class soru1 {
    public static void main(String[] args) {
       // Bir stringi iki esit parcaya bolen ve ilk yarisini yazdiran programi yaziniz

        String text = "Bugun Bayram cocuklar";
        //str = str.substring(0,6);
        //System.out.println("str =" + str);
        System.out.println(text.substring(0,text.length()/2));
    }
}

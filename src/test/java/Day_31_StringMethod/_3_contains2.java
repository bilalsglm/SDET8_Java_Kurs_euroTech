package Day_31_StringMethod;

public class _3_contains2 {
    public static void main(String[] args) {

        String email="test@gmail.com";
        System.out.println(email.contains("@"));// beklenen cikti = TRUE

        String liste="patatoes, tomatoes, eggs, milk, bread,creal,meat,apples";

        if(liste.contains("bread")){
            System.out.println("bread is kelimesi list string icerisinde gecmektedir.");
        }else if(liste.contains("cucumber")){
            System.out.println("cucumber is kelimesi list string icerisinde gecmektedir.");
        }else {
            System.out.println("cucumber kelimesi list string icerisinde yer almamaistir.");
        }

        // email degeri degisti
        email= "test@yahoo.com";
        if(email.contains("@gmail")){
            System.out.println("kisinin mail adresi gmail den alinmistir");
        } else if (email.contains("@yahoo")) {
            System.out.println("kisinin mail adresi yahoo dan alinmistir");
        } else if (email.contains("@hotmail")) {
            System.out.println("kisinin mail adresi hotmail den alinmistir");
        }
    }
}

package Day_31_StringMethod.Odev;

public class soru3 {
    public static void main(String[] args) {
        //Iki stringin ilk ve son iki karakterleri ayni olmasi durumunda true donen methodu yaziniz.
        //Yani iki tane string parametre ama return type boolean olan bir method yaziniz.



    }

    public static boolean ilkSonIkiKarakterAyni(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 2 || str2.length() < 2) { // en az 2 karakter içermeyen stringlerde false döndür
            return false;
        }

        String str1IlkIki = str1.substring(0, 2);
        String str2IlkIki = str2.substring(0, 2);
        String str1SonIki = str1.substring(str1.length() - 2);
        String str2SonIki = str2.substring(str2.length() - 2);

        return str1IlkIki.equals(str2IlkIki) || str1SonIki.equals(str2SonIki);
    }

}

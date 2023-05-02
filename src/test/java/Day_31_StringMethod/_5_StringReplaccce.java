package Day_31_StringMethod;

public class _5_StringReplaccce {
    public static void main(String[] args) {

        // Replace bir string icerisinde yer alan kelimeyi yeniden yazmamizi sagliyor.Degistiriyor

        String str = "Londen is capitak of Germany";
        System.out.println("str = " + str);
        // ilk olarak degisacek olan old karekter, ardindan yerine yazilacak yeni karekter new
        str = str.replace("Londen","Berlin");
        System.out.println("str = " + str);

        //Birden fazla replace etme asagidakigibidir
        str= str.replace("Berlin","Wien").replace("Germany","Austria");
        System.out.println("str = " + str);

        //String de delete olmadigi icin, silmek icin asagidaki gibi replace kullanilabilir.
        str=str.replace("Wien"," ");
        System.out.println("str = " + str);

        //Bir stringte gecen tum ayni karakterleri degistirmek icin

        String string1 = "MerhabaMerhaba";
        string1=string1.replaceAll("[A-Z]","_");
        System.out.println("string1 = " + string1);




    }
}

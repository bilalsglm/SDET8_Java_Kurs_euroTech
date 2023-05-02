package Day_30_DateAndTime;

public class _5_SrtingCharAt {
    public static void main(String[] args) {
        // CharAt ile String icerisindeki character leri almamizi saglayan bir String method dur.

        String word="computer";

        System.out.println(word.length());

        // ilk karekter indexi 0 dir!!!!!
        // charAt bir karakter aldigi icin char degiskenine tanimlamamiz ferekiyor
        char ilkKarekter= word.charAt(0);// charAt() bir index parametresi ile calsir.Index alinacak karekterin
                                        //sifirdan baslayarak index deki karekteri alir

        System.out.println("word objesinin degerinin ilk karakteri :"+ilkKarekter);

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));// ikinci karakteri verir
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(7));




    }
}

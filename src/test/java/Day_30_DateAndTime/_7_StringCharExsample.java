package Day_30_DateAndTime;

public class _7_StringCharExsample {
    public static void main(String[] args) {
        /*
        Bir program yaziniz: Verilen String icerisinde tekrar eden karakterlerin tekrar sayisi ile birlikte yaziniz
        ilk olarak verilen karakterin kac kez tekrar ettigini bulalim
        String word="abcdbbasacssr";
        char a Char='a';
         */
        // 1- ilk olarak verilen karakterin kac kez tekrar ettigini bulalim
        String word = "abcdbbasacssr";
        char verilenChar = 'a';
        int counter = 0;

        //word.length() dongu sayisini belirlior. kucuktur olmasinin sebebi, char index 0 dan basliyor.
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == verilenChar) {
                counter++;

            }
        }
        System.out.println(verilenChar + " karakteri " + word + " icerisinde " + counter + " kez tekrar edilmisir.");

    }
}

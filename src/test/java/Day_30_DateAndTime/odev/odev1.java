package Day_30_DateAndTime.odev;

public class odev1 {
    public static void main(String[] args) {
        // Verilen String icersindeki karakterlerin her bir karakterin kac kez tekrar ettigini veren programi yaziniz.

//        String word = "abcdbbasacssr";
//
//        for (int i = 0; i < word.length(); i++) {
//            char harf = word.charAt(i);
//            int sayi = 0;
//            for (int j = 0; j < word.length(); j++) {
//                if (harf == word.charAt(j)) {
//                    sayi++;
//                }
//            }
//            System.out.println("'" + harf + "' karakteri " + sayi + " kez tekrar ediyor.");
//        }









        String word = "abcdbbasacssr";

        for (int i = 0; i < word.length() ; i++) {
            char harf = word.charAt(i);
            int sayi =0;
            for (int j = 0; j < word.length(); j++) {
                if(harf==word.charAt(j)){
                    sayi++;
                }
            }
            System.out.println("'" + harf + "' karakteri " + sayi + " kez tekrar ediyor.");
        }

    }
}
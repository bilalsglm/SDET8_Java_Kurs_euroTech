package Day_32_Arrays;

public class _6_Exsample {
    public static void main(String[] args) {

        String tex = "Kararmis ruhlarin rencide edici bakislari arasinda hergun affederek yuruyorum; Yazar: Ismet Gunes";
        //Bu cumlede gecen kelimeleri bir array olusturup element olarak atayiniz
        // olusan elementleri icerisinden yazarin ismini kisaltilmis halini yazdiriniz.


//        String[] kelimeler = tex.split(" ");
//       // System.out.println(kelimeler.length);
//        for (String str:kelimeler) {
//            System.out.println(str);
//        }
//
//        char yazarinAdiILkHarfi = kelimeler[kelimeler.length-2].charAt(0);
//        char yazarinSoyAdIlkharf = kelimeler[kelimeler.length-1].charAt(0);
//
//        System.out.println(yazarinAdiILkHarfi+"."+yazarinSoyAdIlkharf+".");


        int   counter = 0;
        for (int i = 0; i < tex.length(); i++) {
            if(tex.charAt(i)==' '){//tex.charAt(i) ilk adimda K harfine esit
                counter++;

            }
        }
        String[] kelimeler=new String[counter+1];//Burada counter+1 adet DEFAULT String degeri olan element olusturdunuz

//       kelimeler[0]="Kararmis";//Bu sekilde deger atamasinda DEFAULT degerini degistirip atanan degeri alir
//        kelimeler[1]="ruhlarin";
        //   tum kelimeleri elementlere atamasini istiyoruz

        int element=0;
        for (int i = 0; i < tex.length(); i++) {
            if(tex.charAt(i)==' '){
                element++;
                continue;
            }
            kelimeler[element]+=tex.charAt(i);//Stringe + operatoru ile ekleme yaptiginizda String halde ekler
            //DEFAULT  veya baska degere sahip bir String ekleme oldugunda
            // onceki degerin ustune ekleme yapar
        }

        //foreach bir dizinin yazdirilmasinda kullandik.
        for (String s:kelimeler) {
            System.out.println("s = " + s.substring(4));

        }
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println(i+"elemente ait kelime ="+kelimeler[i].substring(4));

            if(i== kelimeler.length-2||i== kelimeler.length-1){
                System.out.println(kelimeler[i].substring(4).charAt(0)+".");
            }

        }

    }
}

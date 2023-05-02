package Day_11_Java_Logical_Operators;

public class _7_ifExsample {
    public static void main(String[] args) {

        // Kalan dakikalarin saniye cinsinden dogru sonuc verdiginitest edin

        int dakika=11;
        int saniye=60;

        int toplamSaniye=dakika*saniye;

        if(!(toplamSaniye==660)){// EGER toplam saniye 660 a esit ise IF ile cercevelenen kodlar calsir
            System.out.println("toplamSaniye = " + toplamSaniye);
        }
        //Bu parantez ile kosulun testi tum olasiliklari denemek yorunda kalmadan SONUC

        // ALISTRMA-2
        // Soru: 2tane int degiskeni tanimla x ve y , x ve y ye deger at/al.
        // Eger y o dan buyukse x in degerini DEGISTIR ve 1 ata, x ve y nin yeni degerini yazdirin

        int x=20;
        int y=12;
        if(y>0){
            x=1;
            // operatorlerde x=x+1 ile x+1 esit bir durumu ifade eder
        }
        System.out.println("y = " + y);
        System.out.println("x = " + x);

        // EGER ile ifade edilen kosulun en sade seklinde yazilmasi ve islem onceliklerinin paranteze
        // alinmasi  -- > Logic operatorlerin en cok kullanildigi alandir.

        int number1=36;
        int number2=3;

        if(!(number2/number1==4||number2*number1>100 && number2%4==0)){
            number2+=55;
            number1-=25;
            number2++;
            ++number1;
            System.out.println("number1 = " + --number1);
            System.out.println("number2 = " + ++number1);

            int num = 223224;
            num*=number1;

        }
        System.out.println(number2/number1==5);

    }
}

package Day_18_NestedForLoops;

public class _10_BreakContinueExsample {

    public static void main(String[] args) {
         int sayi = 13;
         int toplam = 0;// instance variable --> eger islemlerin ustunde tanimlamazsaniz, sadece tanimladiginiz
                        // suslu parentez icerinde kullanabilirsiniz. yada yer aldigi statement kullanilabilir

         for( int i=1; i<=5; i++){
             if (sayi>5 && sayi<20 ){
                 System.out.println("Girilen sayi 5 ile 20 arasindadir");
                 //continue; Atla anlamnda idi.For icerisindeki kod blogunu atlamasani soyler
                 break;
             }
             toplam=sayi+i;// Bu islem gerceklesmedi
         }
        System.out.println(toplam);


    }
}

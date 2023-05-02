package Day_17_ForLoopsItnro;

public class _8_ForLoopRules {
    public static void main(String[] args) {
        // 1- Bir infinitive for dongusu olusturma

        // Hicbir sart veya tanimlama olmazsa kod calsir ve sonsuz donguye girer
       // for( ; ; )
        // ilk noktali virgulden once tanimlama kismi ifade eder. Zoeunlu degil.Dongunun disinda tanimlanir
        // iki defa noktali virgul yazilmasi gerekir
        // iki tane noktali virgulun icerisinde dongunun sarti yazilir
        // ikinci noktali virgulden sonra ise artis veya azais degeri yazilir

        //{
         //   System.out.println("Hello new Qas"); // for un kod blogunu tanimlar

       // }
        //int i= 1;
        //for(;i<=10;i+=2){
          //  System.out.println("i = "+i);
       // }
        //int i= 1;
        //for(; ;i++){ // Tanimlama disarda yapip sacede artis ve azalis tanimlandi, dongu sarti yapilmadi sonzus dongu
          //  System.out.println(i);
        //}
        int i= 1;// Tanimlama yapildi, dongu sarti eklendi, artis azalis yok
        for(; i<=15 ;){ // sa

            System.out.println(i);
        }



    }
}

package Day_18_NestedForLoops;

public class _12_ContinueBreak {
    public static void main(String[] args) {

     //   byte X=4;

       // for(; X<=13; X++){
         //   if(X==8){
           //     System.out.println("Sihirli sayiyi buldunuz.");
             //  X=15;// Bu degerle aslinda break yaptim.
               // break;// Kosulu saglamasi durumunda BREAK sadece kendisinden onceki adimlari yazdirir.
                    // Kendisinden sonra FOR DONGUDUN icindeki tum adimlari YAZMA vrya KOSMA ,FOR dongusunu bitirir

            //}
            //System.out.println("X ="+X);// Bu for dongusu icerinde
        //} System.out.println("X ="+X); // Bu for dongusu disinda


        int y= 6;

        for(; y<=11; y++){

            if(y%8==0){  // Burada y==8 yapisinin farkli yazilisi
                System.out.println("Sansli sayiyi buldunuz.");
                y=22;
                continue;// ATLAMA islemi yapar
                // Kendisnden sonraki for dongusu icerindeki statement lari atlar
            }
            System.out.println("y= "+y);
        }


    }

}

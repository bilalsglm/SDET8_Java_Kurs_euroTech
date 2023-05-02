package Day_23_MethodOverloading;

public class _2_primeNumberMethod {
    public static void main(String[] args) {

        // please, write prime number method wid boolean
        // (bir boolean methodu yazin,icnde tek bir parametre olsun ve bunun asal bir sayi olup olmadigini cevap dondur)
        // Main icinde asal sayidir veya asal sayi degildir cevapa gore yazdir

        if (asalSayi(7)){
            System.out.println("Sayi ASAL sayidir");
        }else{
            System.out.println("Sayi asalsai DEGILDIR");
        }

    }
    public static boolean asalSayi(int sayi){
        boolean flog=true;

        if( sayi==0|| sayi==1){
            flog=false;
        }
        for (int i = 2; i < sayi; i++) {
            if( sayi%i==0){
                flog=false;
                break;// Bir sayi kendsinden kucuk bir sayiya bir kez olsun bolunmesi durumunda ASAL DEGIL, dongu bosuna donmez
            }

        }
        return flog;

    }
}

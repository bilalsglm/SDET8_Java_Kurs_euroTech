package Day_51_FinalKeyword;

public class SuperClass {

   // final public static double PI=3.14;
    int sayi;
    public final void ozelDeger(){
        System.out.println("Ozel bir deger atatdik");
        double piDegeri=3.15;
    }

    public final int toplam(int a,int b){
        return a+b;
    }


    public final int toplam(int a){
        return a;
    }

    public final int toplam(int a,int b,int c){
        return a+b+c;
    }
    public final int toplam(){
        int a=5, b=7;
        return a+b;
    }
}

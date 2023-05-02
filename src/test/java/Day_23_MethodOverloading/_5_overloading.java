package Day_23_MethodOverloading;

public class _5_overloading {
    public static void main(String[] args) {

        sum(7,6.4);// Bu ayni zamanda bir int degeri ifade eder. NEDEN return INT oldugu icin
        // overloading bizim yerimize parametrelere bakarak uygun olani secerek islem yapar
        int toplamiYazdir =sum(34,12.4);
        System.out.println("toplamiYazdir = " + toplamiYazdir);
    }

    public static int sum(int sayi1,double sayi2){
        return sayi1+(int)sayi2;// Toplam int oldu ve retturn degerimiz method type ile ayni oldu
    }

    public static int sum(int x,int y,int z){
        return x+y+z;

    }
    public static int sum(int num1,int num2,int num3,double num4){
        return num1+num2+num3+(int)num4;
    }
}

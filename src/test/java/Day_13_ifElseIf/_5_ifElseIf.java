package Day_13_ifElseIf;

public class _5_ifElseIf {
    public static void main(String[] args) {

        int x =3;
        int y =5;

        // Biirncil durum
        if (x>y){
            System.out.println("X degeri Y den Buyuktur");
        }else {
            System.out.println("X degeri Y den buyuk degildir veya x degeri y den kucuk veya esittir");
        }

        // ikincil durum
        if (x>y){
            System.out.println("buyuk degeri X dir");
        } else
            if (x==y) {
                System.out.println("X ile Y esittir");
        }else {
                System.out.println("X, Y den kucuktur");
            }
    //******************************************************
        //int x =3;
        //int y =5;

        if(x>=y){
            x+=5;// x=x+5; X-->8, Y-->5
            x+=y; // x= x+y X -->13 , Y->5
            --y; //Y-->4
            x++; //x-->14
            System.out.println(x++);// x 14 olarak print eder, ama degeri 15 olur
            // x-->15 , Y-->4

            int toplam =x+y;// Burada ki x degeri onceki islem dikkate alindi
            System.out.println();// toplam 19
            }
        System.out.println("x in degeri = "+x);

    }
}

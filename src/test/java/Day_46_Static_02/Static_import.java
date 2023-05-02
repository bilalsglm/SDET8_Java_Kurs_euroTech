
package Day_46_Static_02;
import static java.lang.Math.*;

public class Static_import {
    public static void main(String[] args) {
        double a=sqrt(4);
        System.out.println(Math.sqrt(25));
        System.out.println(sqrt(16));
        System.out.println(PI);
        System.out.println(E);
        System.out.println(multiplyExact(4,6));

    }
    public void carpim(int a,int b){
        multiplyExact(a,b);
    }
}

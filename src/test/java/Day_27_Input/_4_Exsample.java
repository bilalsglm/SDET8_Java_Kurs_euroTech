package Day_27_Input;

import java.util.Scanner;

public class _4_Exsample {
    public static void main(String[] args) {

        // Bir dairenin alanini hesaplayan method yaziniz. Scanner ile veriyi kullanicidan aliniz

        Scanner sc= new Scanner(System.in);
        System.out.print("Hayrina bir yaricap degeri giriniz : ");
        double yaricap =sc.nextDouble();

        System.out.println("Dairenin alani :"+daireninAlani(yaricap));

    }

    public static double daireninAlani(double yaricap){
        double pi =3.14;
        double alan=pi*yaricap*yaricap;

        return alan;
    }
}

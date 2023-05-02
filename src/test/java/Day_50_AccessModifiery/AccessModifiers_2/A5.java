package Day_50_AccessModifiery.AccessModifiers_2;

import Day_50_AccessModifiery.AccessModifiers_1.A4;



public class A5 extends A4 {
    public static void main(String[] args) {
        //A3 obje3=new A3();
        //obje3.name="isim";//DEFAULT degerli bir variable default access modifiere ise, baska bir paketden ERISILEMEZ!!!

        A4 obje4=new A4();
        obje4.school="";
        obje4.test4();



    }
}

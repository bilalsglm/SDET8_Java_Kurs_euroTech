package Day_45_Static_01;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator obje1=new Calculator();
        System.out.println(obje1.plus(4.5,5.5));// OBJE ile static olan bir method cagirdik
        System.out.println(Calculator.plus(4,5));// CLASS ismi ile static olan bir method cagirdik

        int i=Integer.parseInt("33");//String olan bir sayiyi integere cevirdi
        System.out.println(i*5);
        System.out.println(Character.isDigit('4'));//Bu ise bir char olan karekterin

        // ayni sinif icerisnde obje olusturabiiyoruz
       CalculatorTest ct = new CalculatorTest();
       //1. yontem burada methodu cagirmak icin
       ct.m4();// Burada bu sinifa ait bir method oldugundan bu sinifin bir objesi lazim

        //2. yontem
        m4();

        //3.yontem
        CalculatorTest.m4();




    }




    public static void m4(){
        System.out.println("Geliyor yeni SDET ler");

    }
}

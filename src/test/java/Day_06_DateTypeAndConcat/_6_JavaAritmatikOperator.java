package Day_06_DateTypeAndConcat;

public class _6_JavaAritmatikOperator {
    public static void main(String[] args) {
        int additional , subtraction, division, multiplication, modulo;

        additional =3+5;// toplama islemi
        subtraction = 5-3; // cikartma islemi apiyor
        division = 4/2; // bolme islemi yapar
        multiplication = 3*5;// carpma islemi yapar
        modulo = 13%4; // mod alma islemi yapar

        System.out.println("additional = " + additional);
        System.out.println("subtraction = " + subtraction);
        System.out.println("division = " + division);
        System.out.println("multiplication = " + multiplication);
        System.out.println("modulo = " + modulo);

        int num1=10, num2=3;

        int calculation= num1*num2+(num1%num2);
        // ilk once parentez ici yapilir
        // ikinci olarak carpma(*) , bolma (/), mod alma(%)
        // son olarak lowest precedence (+,-)
        System.out.println("calculation = " + calculation);

        int sayi1=23, sayi2=5;
        int sonuc=( sayi1-sayi2)*sayi2+(sayi1+sayi2)%sayi2;
        // oncelik sirasi

        sonuc = 18*5+28%5;
        // ikinci olarak CARPMA, BOLME veya MOdUL
        sonuc = 90+3;
        // son asama TOPLAMA ,CIKARMA
        sonuc= 93;
        System.out.println("sonuc = " + sonuc);
    }
}

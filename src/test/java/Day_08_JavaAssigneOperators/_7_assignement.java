package Day_08_JavaAssigneOperators;

public class _7_assignement {
    public static void main(String[] args) {

        int num1=3+5; // ASSIGNE islemlerinde aritmatik operators kullanilabilir. Assigne isleminde operator ile kisaltma islemi yapilabilir
        System.out.println("num1 = " + num1);

        int num2=1+1+1+1+1-5+2;
        System.out.println("num2 = " + num2);

        System.out.println("***************");// num1->8 num2-->2

        num1-=3;
        System.out.println("num2 = " + num1);// num1->5

        num2+=4;
        System.out.println("num2 = " + num2);// num2->6

        num1*=3;
        System.out.println("num1 = " + num1);// num1->15

        int toplam=num1+num2;
        System.out.println("toplam = " + toplam);// toplam-->21

        toplam-=num1;
        System.out.println("toplam = " + toplam);// toplam-->6

        num1/=2;
        System.out.println("num1 = " + num1);

       // num2/=0;// sifir bolen deger atanabilir fakat complier da hata verir. Kod calsimasina engellemez
        //System.out.println("num2 = " + num2);

        //Mod alam
        toplam%=5;
        toplam=toplam%5;
        System.out.println("toplam = " + toplam);

        num1%=num2;
        num1=num1%num2; // buradaki yazimin kisaltmasi --> num1%=num2
        System.out.println("num1 = " + num1);



    }
}

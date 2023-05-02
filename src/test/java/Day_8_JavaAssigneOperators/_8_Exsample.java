package Day_8_JavaAssigneOperators;

public class _8_Exsample {
    public static void main(String[] args) {

        int number;// DEFAULT degere aritmatik veya diger java operatorlaeri implement edilemz
       // --number; ilk olrak default degerinde farkli bir deger atamak gerekir

        number=24;
        // -- number-= 13; ayni anda iki operator esitligin sag tarafinda kullanilmaz

        number-=12;
        number++;

        number/=3;

        number--;
        --number;

        number-=2;
        System.out.println("number = " + --number);// -1
        System.out.println("number = " + number--); // -1
        System.out.println("number = " + number); //-2

        double deger =12.45;
        int deger1=3;

        deger/=deger1;// 4.15--> ayni zamanda --> deger =deger/deger1
        System.out.println("deger1 = " + deger1);// hic bir degisiklik yasamamis deger1=3 int bir degisken
        System.out.println("deger = " + deger); // deger double bir degisken deger=4.15

        deger1=(int) deger;// int olan bir deger1=deger(double olan bir deger)
        System.out.println("deger1 = " + deger1);// cevap deger1=4
    }
}

package Day_39_ConstructorAndOOP;

public class TIhBank2 {
    public static void main(String[] args) {

        TIhBank hesap1=new TIhBank();//Bir obje create ettik


        //DEFAULT degerleri constructor ile atanmaktadir
        System.out.println(hesap1.subeAdi);
        System.out.println(hesap1.karOrani);
        System.out.println(hesap1.bakiye);

        hesap1.hesapSahibi="Tim James";
        hesap1.hesapNo=10002001;
        hesap1.bakiye=1432;
        hesap1.paraPirimi="Euro";
        hesap1.karOrani=0.10;
        hesap1.subeAdi="Kadikoy subesi";

    }
}

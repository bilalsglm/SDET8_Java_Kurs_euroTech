package Day_39_ConstructorAndOOP;

public class Hesaplar {
    public static void main(String[] args) {

        TIhBank tninEuroHesabi= new TIhBank();

        tninEuroHesabi.hesapSahibi="Tim James";
        tninEuroHesabi.hesapNo=10002001;
        tninEuroHesabi.bakiye=1432;
        tninEuroHesabi.paraPirimi="Euro";
        tninEuroHesabi.karOrani=0.10;
        tninEuroHesabi.subeAdi="Kadikoy subesi";

        TIhBank tninPaundHesabi= new TIhBank();

        tninPaundHesabi.hesapSahibi="Tim James";
        tninPaundHesabi.hesapNo=1000202;
        tninPaundHesabi.bakiye=142;
        tninPaundHesabi.paraPirimi="GBP";
        tninPaundHesabi.karOrani=0.15;
        tninPaundHesabi.subeAdi="Kadikoy subesi2";

        TIhBank tninTlHesabi= new TIhBank();

        tninTlHesabi.hesapSahibi="Tim James";
        tninTlHesabi.hesapNo=1000203;
        tninTlHesabi.bakiye=1242;
        tninTlHesabi.paraPirimi="TL";
        tninTlHesabi.karOrani=0.20;
        tninTlHesabi.subeAdi="Kadikoy subesi3";
    }
}

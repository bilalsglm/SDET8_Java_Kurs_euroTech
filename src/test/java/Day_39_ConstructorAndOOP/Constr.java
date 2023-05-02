package Day_39_ConstructorAndOOP;

public class Constr {
    public Constr(){
//        hesapAktifMi=true;
//        checkBalance=120;
//        bankaAdi="tninBankasi";
    }

    //parametreli constructor
    public Constr (String username,int credit){
        username = hesapSahibi;
        credit=credit;
    }


    //overloadind olma durumunda constructor
    public Constr(int a,int b,String str,boolean b1){//daha fazla parametreli Constructor

    }


    //THIS->Belirleyip deger atama islemini Constructor da yapiyor.

    public Constr(String bankaAdi, String paraBirimi, int hesapNo){
        this.bankaAdi=bankaAdi;  //this.bankaAdi --> instance variable           //bankaAdi-->Local variable yani parametre

        this.paraPirimi=paraPirimi;

        this.hesapNo=hesapNo;

    }




    String hesapSahibi;
    boolean hesapAktifMi;
    String bankaAdi;
    int checkBalance;
    String subeAdi;
    String paraPirimi;
    int hesapNo;
    int bakiye;
    double karOrani;

    public void parayatir(){

    }
    public void paraCek(){

    }

}

package Day_54_Inheritance_Compostion_Example;

public abstract class Bank {

    //  VARIABLES  ///////////////////////////

    private double currentBalance;// ilk hesap acildi, kapansaya kadar hesap dengesini tutar(hesap kaydi)
    private String accountType;// hesap turu
    boolean isAccountClosed;// Hesap KAPALI MI? -- // kapatildi mi
    private double depositBonus;// Para yatirma kosullarina bagli olarak verilen BONUS para miktari
    private double withdravExpence;// Para cekme kosullarina bagli olarak islem ucreti(Hesap turune bagli)
    private double returnRate;// Hesap kapatildiginda alinacak kar orani(current Balance ile carpilarak hesap.)


    //  CONSTRUCTOR  ///////////////////////////
    public Bank(double currentBalance, String accountType) {
//        this.currentBalance = currentBalance;
//        this.accountType = accountType;

    // Encapsulation ile constructor olusturduk
        this.setCurrentBalance(currentBalance);
        this.setAccountType(accountType);
        //getClass().getSimpleName() --> Obje creat edildiginde constructorin oldugu class ismini cagirir
        //Bu java OBJE classina ait framwork (kutuphane bilgisini cagirdik)
        System.out.println(getClass().getSimpleName()+" ´a HOSGELDINIZ!! \nHesap Turu :"+this.getAccountType());
        this.isAccountClosed=false;// Hesap acildi
    }

    // GENEL METHOT

    /**
     * Bu method para yatirma islemleri icin kullanilir, currendbalance gunceller
     * @param depositeValue--> bu variable, yatirilacak para miktarini gorterir
     */

    public void deposite(double depositeValue){
        //this.currentBalance+=depositeValue;
        if (depositeValue<0){
            System.out.println("INVALID DEPOSITE VALUE!! PLEASE CHECK YOUR INPUT");
            // yatirilan para miktari kontrol edin
        }else {
            setCurrentBalance(getCurrentBalance()+depositeValue);// get ile mevcut balance cagirdim ve
                                                                // yatirlilmasi istenen miktari ekledim
            System.out.println("HESABINIZA "+depositeValue+" para eklenmistir.\nMevcut Miktariniz : "+getCurrentBalance());
        }
    }

    /**
     * Bu method para cekme islemi yapar.Current balance dan para cekip cekileni cikarip,currend balance gunceller
     * @param withdrawValue -->Cekilen para miktari
     */
    public void withdraw(double withdrawValue){

        if (withdrawValue<0){
            System.out.println("INVALID DEPOSITE VALUE!! PLEASE CHECK YOUR INPUT");
        }else if (getCurrentBalance()<withdrawValue+getWithdravExpence()){
            System.out.println("YETERSIZ BAKIYE");
        }else {
            setCurrentBalance(getCurrentBalance() - withdrawValue);
            System.out.println("HESABINIZDAN "+withdrawValue+" para cekilmistir.\nMevcut Miktariniz : "+getCurrentBalance());
        }
    }

    //  GET   SET METHODLARI  ///////////////////////////
    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {

        if(currentBalance<0){
            System.out.println("Balance hesabi negative deger alamaz!! Hesabiniz sifirlandi");

        } else {
            this.currentBalance=currentBalance;// Hesabu actiginda yatirdigi para hesabina eklendi
        }
    }
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType.toUpperCase();// hasabin tuurnu berlirledik
    }

    public double getDepositBonus() {
        return depositBonus;
    }

    public void setDepositBonus(double depositBonus) {
        this.depositBonus = depositBonus;
    }

    public double getWithdravExpence() {
        return withdravExpence;
    }

    public void setWithdravExpence(double withdravExpence) {
        this.withdravExpence = withdravExpence;
    }

    public double getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }

}




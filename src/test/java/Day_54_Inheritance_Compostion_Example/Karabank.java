package Day_54_Inheritance_Compostion_Example;

public class Karabank extends Bank{

    public Karabank(double currentBalance, AccountType accountType) {
        super(currentBalance+100, accountType);

        switch (accountType){
            case GOLD:
                setDepositBonus(80);
                setWithdravExpence(90);
                setReturnRate(1.4);
                break;
            case SAVING:
                setDepositBonus(100);
                setWithdravExpence(70);
                setReturnRate(1.1);
                break;
            case INTEREST:
                setDepositBonus(90);
                setWithdravExpence(80);
                setReturnRate(1.2);
                break;
            default:
                System.out.println("GECERSIZ HESAP TURU");
                break;
        }
    }

    @Override
    public void deposite(double depositeValue) {
        if (depositeValue < 3000) {//3000den az olma durumunda herhangi bir degisiklik olmadigi icin,yatirilan degere super e gonderdik
            super.deposite(depositeValue);
        } else {// depositeValue >= 3000 demektir
            super.deposite(depositeValue + getDepositBonus());
        }
    }

    public void withdraw(double withdrawValue) {
        if (withdrawValue<2000){
            super.withdraw(withdrawValue);
        } else {
            super.withdraw(withdrawValue + getWithdravExpence());//Burada kesinti ucreti ile cekilen miktar
        }                                                                   // balance dan cikirildigi icin (islem ucreti ile birlikte)

    }

    @Override
    public void tuzukKur() {
        System.out.println("Karabank Tuzuk sistemi");
    }

    @Override
    public void teminatSistemi() {
        System.out.println("Karabank teminat sistemi");

    }

    @Override
    public void HesapAcmaBonusu(AccountType accountType) {

    }

}

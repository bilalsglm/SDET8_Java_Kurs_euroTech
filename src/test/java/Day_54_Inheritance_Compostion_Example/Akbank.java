package Day_54_Inheritance_Compostion_Example;

public class Akbank extends Bank{

    public Akbank(double currentBalance, AccountType accountType) {
        super(currentBalance+120, accountType);

        Bonus(accountType);

    }

    public void Bonus(AccountType accountType){
        switch (accountType){
            case GOLD:
                setDepositBonus(80);
                setWithdravExpence(70);
                setReturnRate(1.3);
                break;
            case SAVING:
                setDepositBonus(90);
                setWithdravExpence(60);
                setReturnRate(1.2);
                break;
            case INTEREST:
                setDepositBonus(100);
                setWithdravExpence(50);
                setReturnRate(1.1);
                break;
            default:
                System.out.println("GECERSIZ HESAP TURU");
                break;
        }

    }

    @Override
    public void deposite(double depositeValue) {
        if (depositeValue<2000){//2000den az olma durumunda herhangi bir degisiklik olmadigi icin,yatirilan degere super e gonderdik
            super.deposite(depositeValue);
        }else {
            super.deposite(depositeValue+getDepositBonus());
        }

    }


    @Override
    public void withdraw(double withdrawValue) {
        if (withdrawValue<1000){
            super.withdraw(withdrawValue);
        } else {
            super.withdraw(withdrawValue + getWithdravExpence());//Burada kesinti ucreti ile cekilen miktar
        }                                                                   // balance dan cikirildigi icin (islem ucreti ile birlikte)

    }

    @Override
    public void tuzukKur() {
        System.out.println("Akbank tuzuk sistemi");
    }

    @Override
    public void teminatSistemi() {
        System.out.println("Akbank teminat sistemi");

    }

    @Override
    public void HesapAcmaBonusu(AccountType accountType) {

    }
}

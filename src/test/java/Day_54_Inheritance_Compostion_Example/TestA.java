package Day_54_Inheritance_Compostion_Example;

import Day_53_Interface.Soru2.Kare;

public class TestA {

    public static void main(String[] args) {

        //Bank b1=new Bank(-5,"saving");
        Akbank ismetBankaHesabi=new Akbank(1000,"savIng");
        System.out.println("ismetBankaHesabi.getCurrentBalance() = " + ismetBankaHesabi.getCurrentBalance());
        System.out.println("ismetBankaHesabi.getDepositBonus() = " + ismetBankaHesabi.getDepositBonus());


        Karabank ismetBankaHesabi2=new Karabank(1120,"gold");
      //  System.out.println("ismetBankaHesabi2.getAccountType() = " + ismetBankaHesabi2.getAccountType());
        System.out.println("ismetBankaHesabi2.getCurrentBalance() = " + ismetBankaHesabi2.getCurrentBalance());
        System.out.println("ismetBankaHesabi2.getDepositBonus() = " + ismetBankaHesabi2.getDepositBonus());

        ismetBankaHesabi.deposite(2000);
        ismetBankaHesabi2.deposite(1200);

        ismetBankaHesabi.withdraw(3150);
        ismetBankaHesabi2.withdraw(2000);

    }

}

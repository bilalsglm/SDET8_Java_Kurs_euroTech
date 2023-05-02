package Day_26_ObjectAndClass;

public class BankAccount {

    // instance Variable --> Method ve Main icerisinde degil,Class ismini tanimlayan degiskenler
    // Method lar ise Class in fonksiyonlarini ifade eden statement dir.

    //CLASS icerisindeki degisken ve method lari kullanamk icin bu class a ait bir OBJE vea NESNE create etmek gerek

    double balance;
    String accountHolder;
    int accountNumber;

    // Bir dddeposit ve return olmayan fonksiyon Class a uygun olarak tanimladik
    public void deposit(double amout){
        System.out.println("depositing $ " +amout+" to "+accountNumber);
        balance+=amout;
    }
    public void showBalance(){
        System.out.println("----------------");
        System.out.println("Account Holder is " + accountHolder);
        System.out.println("Account Number is " + accountNumber);
        System.out.println("Your Account Balance : "+balance);
    }
    public static void main(String[] args) {
        //BankAccount classina ait bir NESNE olustrur
        BankAccount benimHesabim = new BankAccount();
        benimHesabim.showBalance();

        benimHesabim.balance=124.45;
        benimHesabim.accountHolder ="Mr. Ramazan";
        benimHesabim.accountNumber=1233456623;

        benimHesabim.showBalance();

        benimHesabim.deposit(100.25);

        benimHesabim.showBalance();

    }

}

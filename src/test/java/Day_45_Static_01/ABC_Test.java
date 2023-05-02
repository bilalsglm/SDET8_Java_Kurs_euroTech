package Day_45_Static_01;

public class ABC_Test {
    public static void main(String[] args) {

        ABC s1=new ABC();// Bir obje olusturduk, ABC class indan
        ABC s2=new ABC();

        // STATIC keyword
        //1- Fields ile kullanildiginda sadece class ismi ile erisilme imkani olur.
        // ve sadece class a ait degiskenlere static verebiliyoruz
        //2- Static bir method sadece static bir method cagirabiliriz

        ABC.m1();//--> burada oldugu gibi class ismiyle static bir method cagirdik,static main method icine
        s2.m2(); // Burda OBJE methodu cagirdi
        //ABC.m2(); bu sekilde mstatic olmayan methodu cagiramayiz


    }
}

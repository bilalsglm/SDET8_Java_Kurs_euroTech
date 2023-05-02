package Day_8_JavaAssigneOperators;

public class _1_UnaryOperators {
    public static void main(String[] args) {

        int      sayi       =   12      ;

        int rakam = 132;
        System.out.println("rakam = " + rakam);

        rakam=12;
        System.out.println("rakam = " + rakam);



        rakam++; // Burada ayni degiskene esittir operatoru ile farkli bir deger atayabiliyorduk
        // Bu deger atama islemi arti operatoru ile yaptik. Peki ne demek? Bir artirdik (++)+1
        System.out.println("rakam = " + rakam);

        rakam=rakam+1; // burada rakam onceki degerine 1 eklenmis seklinde degere sahip oldu
        System.out.println("rakam = " + rakam);
    }
}

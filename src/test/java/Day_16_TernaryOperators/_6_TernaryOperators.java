package Day_16_TernaryOperators;

public class _6_TernaryOperators {
    public static void main(String[] args) {

//        int sayi =24;
//        System.out.println();
//
//         System.out.println((sayi>0) ?"Pozitif Number" :"Negatif Number");

        int n1 = 12, n2=9, n3=-14;
//        int n1,n2,n3:
//        n1 =12;
//        n2=9;
//        n3=-14;

        // Buradaki sayilarin en buyuk olani Ternary operator yardimi ile bulunuz

        int enBuyuk =(n2 >n1) ? (n2>n3) ? n2 :n3 :((n1>n3) ? n1 : (n3>n2) ? n3 : n2);

        System.out.println("enBuyuk = " + enBuyuk);

        // Clasik yontem


    }
}

package Day_21_Methods_1;

public class _10_methodWithParameters {
    public static void main(String[] args) {

        toplama(12,25);// iki int degeri tanimlamamiz gerekli cunku method parametreli
        toplama(23,45);// iki tane farkli sayi yazdik
        for (int i = 0; i < 4; i++) {
            toplama(12,12);

        }
    }

    // Parametreli bir method tanimladik
    public static void toplama(int sayi1,int sayi2){// iki tane int parametre yazdik
        System.out.println(sayi1+sayi2);// body kisminda verilen sayilarin toplamini yazdiran bir kod statement yazdik
    }
}

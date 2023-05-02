package Day_19_WhileDoWhile;

public class _7_doWhileExample {
    public static void main(String[] args) {

        int sayi=23;
        int i =1;

        do {
            sayi=sayi-i;// 1.Dongu --> sayi=22: 2.Dongu sayi=20
            i++;// 1.Dongu --> i=2, 2.Dongu i=3
            System.out.println("i="+sayi); // 22, 20
            // Beklenen cikti: 22
        }while (sayi%5!=0);
        // While (sayi%5!=0) SARTI saglamiyor ama WHILE satirina kadar kod calsiyor. ILK KEZ.
    }
}

package Day_19_WhileDoWhile;

public class _4_DoWhile {
    public static void main(String[] args) {

        int i=10;
        // ilk BASLANGIC asamasinda SART kontrol edilmez. Sonrasinda sarti sagladigi surece dongu doner.
        do {
            System.out.println("i = "+i);// i--> 2 iken
            i--;// burda i--> 1 oldu

        }while (i>1);
    }
}

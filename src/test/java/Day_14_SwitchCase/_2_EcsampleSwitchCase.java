package Day_14_SwitchCase;

public class _2_EcsampleSwitchCase {
    public static void main(String[] args) {

        int sayi=10;
        int kalan=sayi%2;

        switch (kalan){
            case 0:
                System.out.println("bu sayi cift sayidir.");
                break;
            case 1:
                System.out.println("bu sayi tek bir sayidir");
                break;
        }
    }
}

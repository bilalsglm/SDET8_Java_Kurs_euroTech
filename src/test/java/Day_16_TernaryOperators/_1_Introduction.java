package Day_16_TernaryOperators;

public class _1_Introduction {
    public static void main(String[] args) {

        int sayi=1286;

        //int onlar= (128/10)= 128,6 CASTing Double bir degeri virgulden sonrasini atarak int yazar

        int onlarBasamagi = (sayi/10)%10;

        switch (onlarBasamagi){

            case 0 : System.out.println("Onlar basamagi : o`dir."); break;
            case 1 : System.out.println("Onlar basamagi : 1`dir."); break;
            case 2 : System.out.println("Onlar basamagi : 2`dir."); break;
            case 3 : System.out.println("Onlar basamagi : 3`dir."); break;
            case 4 : System.out.println("Onlar basamagi : 4`dir."); break;
            case 5 : System.out.println("Onlar basamagi : 5`dir."); break;
            case 6 : System.out.println("Onlar basamagi : 6`dir."); break;
            case 7 : System.out.println("Onlar basamagi : 7`dir."); break;
            case 8 : System.out.println("Onlar basamagi : 8`dir."); break;
            case 9 : System.out.println("Onlar basamagi : 9`dir."); break;
            default: System.out.println("Tanimlanmayan deger");
        }

    }
}

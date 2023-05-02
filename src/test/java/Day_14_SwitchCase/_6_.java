package Day_14_SwitchCase;

public class _6_ {
    public static void main(String[] args) {
        // 2 basamakli bir sayiyi ekrana yazi ile azdiran Exsample:28--->yirmi sekiz

        int number=22;
        int birlerBasamagi = number%10;
        int onlarBasamagi = number/10;

        if(number>=10 && number<=99){

        switch (onlarBasamagi){
            case 1: System.out.print("on ");break;
            case 2: System.out.print("yirmi ");break;
            case 3: System.out.print("otuz ");break;
            case 4: System.out.print("kirk ");break;
            case 5: System.out.print("elli ");break;
            case 6: System.out.print("altmis ");break;
            case 7: System.out.print("yetmis ");break;
            case 8: System.out.print("seksen " );break;
            case 9: System.out.print("doksan ");break;
        }
        switch (birlerBasamagi) {
            case 1: System.out.println("bir");break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("uc");break;
            case 4: System.out.println("dort");break;
            case 5: System.out.println("bes");break;
            case 6: System.out.println("alti");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekiz");break;
            case 9: System.out.println("sokuz");break;
        }
        }else
        {
            System.out.println("Sayi iki basamakli degildir");
        }


    }
}

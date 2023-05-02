package Day_20_BranchingExample;

public class _2_BrachingExsample {
    public static void main(String[] args) {
         int count = 10;

        while(true)
        {
            if( count==0){

                System.out.println("Dongu burada tamamlandi, Sonsuz donguden ciktik");
                System.out.println("count = " + count);
                break;
                //System.out.println("Dongu devam edebilir mi");
                // Break kendisinden sonra yazilan statement okumaz.o yuzden sartin yazildigi if icerisinde
                // sonra yazilana hata doner

            }

            System.out.println(count);
            count--;
        }
    }
}

package Day_21_Methods_1;

public class _7_methodexsample {
    public static void main(String[] args) {
        // Method birden fazla kez cagirilabilir
//        merhaba();
//        merhaba();
//        merhaba();
//        merhaba();


        // For ile kac kez isterseniz method cagirip calistirilabilir
        for (int i = 0; i < 4; i++) {
            merhaba();

        }
    }
    public static void merhaba(){
        System.out.println("Merhaba Dunya");

    }
}

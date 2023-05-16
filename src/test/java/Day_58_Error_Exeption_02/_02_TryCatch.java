package Day_58_Error_Exeption_02;

public class _02_TryCatch {
    static String test;

    public static void main(String[] args) {

        //String test ="5";

        try {

            int a=Integer.valueOf(test);
            int b=1;

            System.out.println("Sonuc = "+b/a);
            System.out.println("Test");

        }catch (ArithmeticException ex){
            ex.printStackTrace();//Kirmizi gelen hatayi yaziyordu
        }

    }

}

package Day_57_Error_Exeption_01;

public class _06_TryCatchFinally {
    public static void main(String[] args) {

        String str="ABC";


        try {
            System.out.println("Try block ici");
            System.out.println(str.substring(5));

        }catch (NullPointerException ex){
            System.out.println("Null Point Exeption hatasi var,This block statement");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Test basarisir oldu! Test FAIL");
        }catch (Exception ex){
            System.out.println("Genel hatalar");
        }finally {//Yazilmasi zorunlu degil, her sartta kosar, try-catch statemenet icinde en altta yer alir
            System.out.println("Finally block");
        }
    }
}

package Day_57_Error_Exeption_01;

public class _03_TryCatch {
    public static void main(String[] args) {

        System.out.println("HATADAN ONCE!!!");


        try {//Dene, hatanin baslama ihtimali olan yerin ustune konur

            //HATA

            System.out.println(1 / (1 - 1));
        }//hatanin oldugu zaman programin kirilmasini engeller

        catch (Exception e){//Hata isimli degiskene hatanin bilgidini verir
            System.out.println("Burada hata oldu");
        }

        System.out.println("HATADAN SONRA");

    }
}

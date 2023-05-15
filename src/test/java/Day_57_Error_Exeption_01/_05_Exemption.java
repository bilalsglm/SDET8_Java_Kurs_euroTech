package Day_57_Error_Exeption_01;

public class _05_Exemption {
    public static void main(String[] args) {

        String str="Bugun";
        int a=5;
        int b=0;
        int c=0;

        try {
            System.out.println("1. Adim string ile ilgili hata");
            char ch=str.charAt(5);//Burada hata olusacak
            System.out.println("2. Adim, aritmetik bir hata");
            c = a/b;//Aritmetik bir hata olusacak
            System.out.println("3. Adim try statement sonu");
        }catch (StringIndexOutOfBoundsException ex)//Burada ozel bir isim gerekmiyor,
                                                // hatayi tanimlayacak bir isim verilmesi uygun olacaktir
        {
            System.out.println("4. Adim, hata olmasi durumunda catch calisti");
            System.out.println("Hata : String olan nesnenin index degeri asildi");
        }catch (AbstractMethodError ex){
            System.out.println("Hata : aritmetik islem hatasi");
        }catch (Exception ex){
            System.out.println("Hata : Genel bir hata olustu");
        }

    }
}

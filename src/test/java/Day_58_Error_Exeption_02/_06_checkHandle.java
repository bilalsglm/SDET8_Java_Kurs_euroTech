package Day_58_Error_Exeption_02;

import java.util.Scanner;

public class _06_checkHandle {

    // kullanıcıdan hava sıcaklığını isteyiniz.
    // ayrı bir metodda bunun kontrolünü yaparak hava
    // sıcaklığı 10 dan küçük ise IOException hatası oluşturunuz
    // mainden çağırarak hatayı kontrol ediniz.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Hava sicakligi = ");
        int sicaklik=oku.nextInt();

        try {
            sicaklikKontrol(sicaklik);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void sicaklikKontrol(int sicaklik){
        if (sicaklik<=10){
            System.out.println("Hava gercekten soguk disari cikmayin ");
        }else {
            System.out.println("Disarida basketbol oynayabilirsiniz");
        }
    }
}

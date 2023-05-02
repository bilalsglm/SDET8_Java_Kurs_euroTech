package Day_26_ObjectAndClass;

public class CarObject {
    public static void main(String[] args) {

        BMW b1= new BMW();// Burada nesne b1 dir

//        System.out.println(b1.marka);
//        System.out.println(b1.price);

        BMW b2 = new BMW();// Burada ikinci bir nesne olusturduk --> b2

        // *** Beklenen cikti ***
        // aracin markasi
        // aracin modeli
        // aracin fiyati
        System.out.println("**************B1****************");

        //--->!!! b1.showPrice();--> Burada switch case icin bir deger atanmazsa, hata verir.
        // Cunku tanimli veya tanimsiz bir degeri olmasi gerekir.Yoksa okumaz ve null degeine hata verir.

        System.out.println("Arabanin markasi = " + b1.marka);
        b1.model="x1";
        System.out.println("Arabanin modeli = "+b1.model);
        b1.showPrice();// Fiyat icin yazdigim methodu cagirdim
        if(b1.aracElektrikliMi){
            System.out.println("Arac Elektiriklidir.");
        }else{
            System.out.println("Arac Elektirikli degildir.");
        }
        System.out.println("***************B2**********");

        System.out.println("Arabanin markasi = " + b2.marka);
        b2.model="x5";
        System.out.println("Arabanin modeli = "+b2.model);
        b2.showPrice();
        b2.aracElektrikliMi=true;
        System.out.println("Arac Ekejtirikli mi : "+b2.aracElektrikliMi);


        System.out.println("***************B3**********");
        BMW b3 = new BMW();

        System.out.println("Arabanin markasi = " + b3.marka);
        b3.model="Camry";
        System.out.println("Arabanin modeli = "+b3.model);
        b3.showPrice();

        System.out.println("Arac Ekejtirikli mi : "+b3.aracElektrikliMi);


    }


}

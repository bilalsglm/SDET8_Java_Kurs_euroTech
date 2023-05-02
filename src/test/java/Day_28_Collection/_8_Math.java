package Day_28_Collection;

import java.util.Random;

public class _8_Math {
    public static void main(String[] args) {

        // Math class iceriisnde bir cok static variable yer almaktadir. Cok kullanisli olanlari genellikle kullanmak gerekir

        System.out.println(Math.max(7,5));
        System.out.println(Math.min(3,5));

        System.out.println(Math.PI);
        System.out.println(Math.E);
        // Double degerlerinin min max olanini alma method unu cagirdik Math class indan

        System.out.println(Math.min(2.7,8.5));
        System.out.println(Math.max(4.7,8.5));

        System.out.println(Math.pow(2,3));// uslu ifade

        System.out.println(Math.floor(-2.3)); // expected result -3 // floor -- zemin veya taban demek
        System.out.println(Math.ceil(3.3)); // expected result 4 // ceil -- tavan veya ust demek

        // BU Math class i icerisinde random
        Math.random(); // STATIC ise direct olarak class ismi ile cagirabiliyoruz. Method vea degisken olmasi farketmez

        // BU ise Random class i ifade eder. Bu class dan bir nesne olusturulur
        Random r = new Random();

        // Random icin ikisini de kullanabilirsiniz


        // Onemli, herkesin bu kutuphaneyi ornekler cozerek calisip arastirmasini rica ediyorum
        // TODO : regex kutuphanesinde tanimli !!!!!


    }
}

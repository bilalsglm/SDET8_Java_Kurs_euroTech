package Day_21_Methods_1;

public class _4_methodExecution {

    public static void method1(){
        System.out.println("Methot1 kodunu calistirdi.");
        System.out.println("Method1 ikinci sirasi");
    }

    public static void main(String[] args) {
        // Butun Methodlari tek bir method icerisinde ve sede bir sekilde yazma
        methodlar();

        // TEMEL AMAC KOD AZIMINDA
        // Afficiency Memory --> Hardiski en az yoran kod yazimi
        // RAM --> En az kullnim ile calismak
        // Clean kod Ahlaki (SOLID cradentials)--> interview sorusu (CTU -->Tum IT depertmanin sorumlusu)

    }

    public static void method2(){
        System.out.println("Method2 kodlarini calistirdi.");

    }
    public static void methodlar(){
        // Bir method degir method ile cagirilir
        System.out.println("Methodlari adli fonsiyonumuz calistirir");
        method1();
        method2();
    }
}

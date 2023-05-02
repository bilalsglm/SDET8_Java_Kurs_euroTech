package Day_45_Static_01;

public class ABC {

    // Class properties --> Sinifa ait degiskenler --> instance variable,fields,class variable
     static String name;// class variable
    int age;// fields= instance var.



    public static void toplam(){
        // NON static variable olmak zorunda
        int a=5;// Local variable
        int b=6;
        System.out.println(a+b);

    }
    public static void m1(){

    }
    public void m2(){

    }

    ABC(){ // Constructor --> Access(erisme) Modifier yazilmadan DEFAULT constructor yazdik

    }
}

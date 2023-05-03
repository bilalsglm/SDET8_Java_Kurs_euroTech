package Day_52_Abstraction.Example_1;

public  abstract class Animal {

    // instance veriable

   protected String name;
   private static int age;


    // abstract methodlar override edilmek ZORUNDA (child classlarda)
    abstract void eat();// BU sekilde bir abstract method yazdik.

    abstract String ses();//abstract method

    //CONCRETE --> Soyut olmayan method
    public void toplama(String ad,String soyad){
        String fulName=ad+soyad;
    }

    //Constructor in Abstract class
    Animal(){//Default constructor

    }
    Animal(int age){//Default constructor
        this.age=age;

    }

    //instance block
    {
        System.out.println("bu bir instance block");
    }
    static
    {
        System.out.println("Static block yazdik");
    }
    private void sleep(){
        System.out.println("Animals are sleeping");
    }

}

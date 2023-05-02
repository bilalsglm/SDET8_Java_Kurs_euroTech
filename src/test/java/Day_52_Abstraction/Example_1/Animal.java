package Day_52_Abstraction.Example_1;

public  abstract class Animal {
    // instance veriable

   protected String name;
   private static int age;

    {
        System.out.println("bu bir instance block");
    }
    static
    {
        System.out.println("Static block yazdik");
    }


    // abstract methodlar override edilmek ZORUNDA (child classlarda)
    abstract void eat();// BU sekilde bir abstract method yazdik.

    abstract String ses();//abstract method

    //CONCRETE --> Soyut olmayan method
    public void toplama(int a,int b){
        int total=a+b;
    }

}

package Day_52_Abstraction.Example_2;

import java.util.Scanner;

public class Mercedes extends Car {
    Mercedes(int motorGucu) {
        super(motorGucu);
    }

    @Override
    void yakit() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Arac Elektrikli mi True veya False ? ");
        boolean aracElektrikliMi=sc.nextBoolean();

        if(aracElektrikliMi){
            System.out.println("Yakit dusuk olur");
        }else {
            System.out.println("Yakit yuksek olur");
        }
    }

    @Override
    protected int tekerSayisi() {
        return 10;
    }
    public static int kapisiSayisi(){
        if(age<30){
            return 2;
        }else
            return 4;
    }



    public static void main(String[] args) {
        Mercedes m1=new Mercedes(12);
        m1.yakit();

        m1.name="S serisi";
        System.out.println(m1.name);
        System.out.println(m1.tekerSayisi());
        age=32;
        System.out.println(kapisiSayisi());

    }
}

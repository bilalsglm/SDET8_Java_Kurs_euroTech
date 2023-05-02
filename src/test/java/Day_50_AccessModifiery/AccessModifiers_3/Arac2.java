package Day_50_AccessModifiery.AccessModifiers_3;

import Day_50_AccessModifiery.AccessModifiers_2.Arac;


public class Arac2 extends Arac {

    public Arac2() {

        System.out.println("engine=2.4 = " + (engine = 2.4));


    }
    protected double test3(){

        return engine=3.6;
    }
}

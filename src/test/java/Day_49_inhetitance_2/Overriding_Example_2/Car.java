package Day_49_inhetitance_2.Overriding_Example_2;

public class Car extends Vehicle {
    @Override
    void yakit(double speed,double motorGucu){
        yakitMiktari+=(motorGucu*0.75);
        System.out.println(yakitMiktari);
    }

}

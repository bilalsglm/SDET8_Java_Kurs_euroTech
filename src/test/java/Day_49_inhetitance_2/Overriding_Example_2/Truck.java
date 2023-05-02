package Day_49_inhetitance_2.Overriding_Example_2;

public class Truck extends Car{
    @Override
    void yakit(double speed,double motorGucu){
        yakitMiktari+=(speed*0.01)+(motorGucu*0.75);
        System.out.println(yakitMiktari);

    }

    public static void main(String[] args) {
        Truck t1=new Truck();
        t1.yakit(5,12);
        t1.yakit(2,4);

    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", yakitMiktari=" + yakitMiktari +
                '}';
    }
}

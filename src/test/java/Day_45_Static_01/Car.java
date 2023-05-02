package Day_45_Static_01;

public class Car {
     int door=2;// Default yani int old, icin 0´dir.


     public static void run(){
         System.out.println("Car is running");
     }
     public int getDoorNummer(){
         return door+2;
     }

}

class Carstest {
    public static void main(String[] args) {

        Car c=new Car();
        c.run();
        Car.run();

        //System.out.println("(c.getDoorNummer()*5) = " + (c.getDoorNummer() * 5));

        System.out.println(c.getDoorNummer()+2);
    }
}

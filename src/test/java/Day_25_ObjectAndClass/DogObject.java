package Day_25_ObjectAndClass;

public class DogObject {
    public static void main(String[] args) {

        Dog benimKopegim;
        benimKopegim=new Dog();
        //Dog benimKopegim = new Dog();

        benimKopegim.age=2;
        benimKopegim.color="Beyaz";
        benimKopegim.name="Pamuk";

        // Nesne ile class da yer alan methodlari cagirdik
        benimKopegim.hungry();
        benimKopegim.barking();
        benimKopegim.sleep();

        System.out.println(benimKopegim.breed);
        // Expected result:

        Dog myDog =new Dog();
        myDog.name ="Cont";
        myDog.hungry();// Hungry isimli methodu cagisdik

    }
}

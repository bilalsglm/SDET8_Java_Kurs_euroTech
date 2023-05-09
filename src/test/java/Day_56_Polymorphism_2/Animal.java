package Day_56_Polymorphism_2;

public class Animal {

    public void sound(){

        System.out.println("Hayvan ses cikardi");
    }
}

class Dog extends Animal{
    public void sound(){

        System.out.println("Kopek hav kav dedi");
    }
    public void eat(String s){

    }
}
class AnimalTest{
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.sound();
        //animal.eat();// BU method cagrilmama sebebi override olmamasindan kaynaklidir
        // child class daki SADECE override edilmis method lar Parent class refere edilerek olusmus objelerde kullanilabilir


    }
}
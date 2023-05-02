package Day_48_inheritance_02.superKeyword;

public class Dog extends Animal  {

    int ayes;
    int legs;
    int teeth;
    int nectSpot;

    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }

//    Dog(int ayes,int legs,int teeth,int nectSpot ){
//        super("Lessi",1,1,8,20);
//    }
        Dog(int ayes,int legs,int teeth,int nectSpot ){
        super("Lessi",1,1,8,20);// Deger atiyarak cagirdik.
        this.ayes=ayes;
        this.legs=legs;
        this.teeth=teeth;
        this.nectSpot=nectSpot;


    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", brain=" + getBrain() +
                ", body=" + getBody() +
                ", size=" + getSize() +
                ", weight=" + getWeight() +
                '}'+"Dog{" +
                "ayes=" + ayes +
                ", legs=" + legs +
                ", teeth=" + teeth +
                ", nectSpot=" + nectSpot +
                '}';

    }

    //Constructer li olan bir class asagida old. gibi constructer create edilerek extend edilebilir
//Bu class objesi icin bir constructer olusturduk. Yani 9 fields lazim bir obje icin
//Bu super class in EXTENDS edilme islemi icin bir constructur cagrildi.
//    public Dog(String name, int brain, int body, int size, int weight) {//bu super classin fields leri
//        super(name, brain, body, size, weight);//Super class dan gelenler
//    }
//  Dog(int eyes, int legs, int teeth, int nectSpot){
//      super("Lessi",1,1,8,20);//bir extends edilen class dan OBJE
//                                                          //create etmek gibi constructer SUPER
//                                                           //kullandik
//  }

}

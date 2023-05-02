package Day_52_Abstraction.Example_3;

public abstract class Sekil {

    static int uzunluk;
   private String name;

    Sekil() {
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    abstract double alan();
    abstract double cevre();

    public void ciz(){
        System.out.println(name+" Sekli cizildi");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan hesaplama='" + Math.round(alan()) + '\'' +
                "cevre hesaplama='" + Math.round(cevre()) + '\'' +

                "uzunluk ='" + uzunluk + '\'' +


                '}';
    }
}

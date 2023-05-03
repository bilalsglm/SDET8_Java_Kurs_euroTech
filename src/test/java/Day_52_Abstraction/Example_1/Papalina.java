package Day_52_Abstraction.Example_1;

public class Papalina extends Fish {


    @Override
    void eat() {

    }

    @Override
    String ses() {
        return "Duyulmayan bir ses cikariyor";
    }

    @Override
    void yasamYeri() {
        System.out.println("Tatli ve tuzlu suda yasar");

    }

    public static void main(String[] args) {
        Papalina balik1= new Papalina();
        balik1.name="Buyuk Papalna";
        balik1.toplama("Buyuk","Papalina");//Abstract olmayan method objeyi tanimliyor
                                    //Burada objeyi modify etmede kullandik

        balik1.ses();//Burada abstract methodu herhangi birsey yazmadan cagirir
        System.out.println(balik1.ses());//return type oldugu icin
        //System.out.println(balik1.yasamYeri());// Void oldugu icin

    }
}


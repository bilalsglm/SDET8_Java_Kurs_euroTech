package Day_52_Abstraction.Example_1;

public class Hamsi extends Papalina {

    //Burada normal olan bir classi extend ettik. Bu extend edilen Papalina classi ,Parent veGrand Parent
    //abstract classlari extend eden bir class
    //Ama override ve baska bir zorunluluk olusturmadi

    @Override
    void eat() {
        System.out.println("Hayvanlar tuketim yaparak buyurler.");

    }
    @Override
    String ses(){
        return "Sesi duyulmuyor";
    }
    @Override
    void yasamYeri() {
        System.out.println("Tuzlu suda yasar");

    }

    public static void main(String[] args) {
        Hamsi h1=new Hamsi();
        h1.eat();
        h1.yasamYeri();
        System.out.println(h1.ses());
    }
}

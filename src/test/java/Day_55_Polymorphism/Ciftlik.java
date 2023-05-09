package Day_55_Polymorphism;

public class Ciftlik {
    public static void main(String[] args) {
        Animal1 animal=new Animal1("Ali");
        animal.privateMethod();

        //Buradaki methodlar OBJECT class indan gelen bilgiler. OBJECT, class larin babasi rolundedir.
        System.out.println(animal.getClass());
        System.out.println(animal.getClass().getName());
        System.out.println(animal.getClass().getSimpleName());
    }


}
class Animal1{

    //Private method lar SADECE bulunduklari class da kullanilabilirler
    private void yas(){
        System.out.println("Hayvanlarin yasi");
    }
    public void tuketim(){
        System.out.println("Hayvanlar yasamak icin beslenirler");
    }

    public void privateMethod(){
        yas();
        tuketim();
    }

    private String name;

    public Animal1(String name) {
        this.setName(name);
    }



    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal1{" +
                "name='" + name + '\'' +
                '}';
    }
}
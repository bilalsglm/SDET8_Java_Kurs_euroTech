package Day_28_Collection;

public class _2_StringPool {
    public static void main(String[] args) {

        String name1 ="Pamuk";
        // String bir class tir.
        // New olarak bir nesne olusturmak istetiginizse, nesne tanimlamamaiz gereklidir.
        String name2= new String("Pamuk");

        String name3="Pamuk";

        // Burada ki name2 ile name3 ayni objeyi ifade eder
        //FAKAT name2 baska bir obje veya nesne create edildigi icin farkli olarak tanimlanir.

        if (name1 ==name3){
            System.out.println(true);
        }
        // == olarak bakilan degerler ayni kabi ifade ettiginde TRUE doner
        // name1 ve name3 ayni NESNE yi ifade eder, yani ayni kap. Baska bir degisken daha olusturulup ayni
        // degeri ifade etmesi durumunuda esitleyip yani deger olusturur.

        if (name1.equals(name2)){
            System.out.println("name3 = " + name3);
        }
        //Person person1=new Person();

        Person.age=15;// Static degiskenler sadece class ismi ile cagirilabilir.
        // Nesen olustrulup statik olmayan degiskenler de cagirilabiliyordu. Genelde

    }
}

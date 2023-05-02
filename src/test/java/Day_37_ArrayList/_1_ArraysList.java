package Day_37_ArrayList;

import java.util.ArrayList;

public class _1_ArraysList {
    public static void main(String[] args) {

        //Ararys-->Tum dizilerin icindeki fonksionlari barindirir
        //ArrayList ise COLLECTION altinda yer almaktadir

        int [] sayilar={1,3,5,6};

        ArrayList<String> isimler=new ArrayList<String>();
        //ArrayList sadece WRAPPER class lar ile calisir

        ArrayList<Boolean> dogruYanlis= new ArrayList<>();
        ArrayList<Integer> saList=new ArrayList<>();

        System.out.println("Eleman atamadan isimler = " + isimler);
        //Eleman ekleme
        isimler.add("Bilal");
        isimler.add("Gulden");
        isimler.add("Tazeoglu");
        isimler.add("Ramazan");
        isimler.add("Ismail");
        isimler.add("Selim");

        System.out.println("6 eleman atadik isimler = " + isimler);
        System.out.println(isimler.toString());//Burada dinamik olan dizinin

        //Elemen sayisini bulma

        int elemanSayisi =isimler.size();
        System.out.println("elemanSayisi = " + elemanSayisi);

        //index bulma
        String elemanDegeri=isimler.get(2);
        System.out.println("2 deki elemanDegeri = " + elemanDegeri);


        //index e elemen atama
        isimler.set(2,"GuldenT");
       // isimler.set(6,"ismet");
        System.out.println("Set edildikten sonra liste : "+isimler);

        // Bir elemanin indexini bulma
       int inexDegeri= isimler.indexOf("Selim");
        System.out.println("inexDegeri = " + inexDegeri);

        //belirli bir eleman var mi yok mu
        boolean elemenCheck= isimler.contains("Ismail");
        System.out.println("elemenCheck = " + elemenCheck);

        //dizide elemen olup olmadigini kontrol etmek(Bos olup olmadigini kontrol etme)
        boolean emptyMi=isimler.isEmpty();
        System.out.println("emptyMi = " + emptyMi);

        //eleman silme   1-->indexe gore, 2--> elemen degeri gore
        System.out.println("isimler.remove(\"Selim\") = " + isimler.remove("Selim"));
        System.out.println("ilk remove sonra isimler = " + isimler);
        System.out.println("isimler.remove(2) = "+isimler.remove(2));
        System.out.println("ikinci remove sonrasi isimler = " + isimler);


    }
}

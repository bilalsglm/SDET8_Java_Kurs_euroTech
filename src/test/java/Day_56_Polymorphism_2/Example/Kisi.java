package Day_56_Polymorphism_2.Example;

public class Kisi {
    private String name;
    private String soyadi;
    private String gorevi;

    public Kisi(String name, String soyadi, String gorevi) {
        this.name = name;
        this.soyadi = soyadi;
        this.gorevi = gorevi;
    }

    //Methodun parametresinde-->Kisi dataType olan Kisi class indan bir obje olusturduk
    public static void kimlikOlustur(Kisi kisi){//Buradaki parametre direkt bir OBJE craete eder
        //kisi=new Ogrenci(); --> Kisi kisi=ogrenci; ogrenci --> Dort parametresi olan bir obje
        //kisi=new Calisan(); -->Kisi kisi=calisan;

        //(Kisi kisi) parametre --> Kisi kisi=new Kisi();
        //Constructor dan gelen Kisi deki instance variable degerlerini yazdirdik
        System.out.println("kisi.name = " + kisi.name);
        System.out.println("kisi.soyadi = " + kisi.soyadi);
        System.out.println("kisi.gorevi = " + kisi.gorevi);

        //gelen kisi ogrenci ise
        if (kisi instanceof Ogrenci){
            System.out.println("Sube = "+((Ogrenci) kisi).getSube());
        }

        if (kisi instanceof Calisan){
            System.out.println("Departman = "+((Calisan) kisi).getDepartman());//Cast yapilarak kisi objesi Ogrenci objesine donusturuldu
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }
}

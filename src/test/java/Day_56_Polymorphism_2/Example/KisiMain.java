package Day_56_Polymorphism_2.Example;

public class KisiMain {
    public static void main(String[] args) {

        Ogrenci ogrenci=new Ogrenci("Bilal","Saglam","Main","euroTech8");

        Calisan calisan=new Calisan("Gulden","Tazeoglu","Automation","QA");

        Kisi.kimlikOlustur(ogrenci);
        System.out.println("****************");
        Kisi.kimlikOlustur(calisan);


        System.out.println("-----------------");
        Kisi ogr=new Ogrenci("Ayse","Nur","Automation","Batch_08");

        Kisi calis=new Calisan("Ramazan","Ogretmis","Automation","SDET");


        Kisi.kimlikOlustur(ogr);
        System.out.println("******************");
        Kisi.kimlikOlustur(calis);

        Kisi kisi1=new Kisi("","","");
        Calisan kisi11=new Calisan("","","","");
        //Kisi.kisi12=kisi11;

        Kisi kisi = ogrenci;

        toplama(5,6);
    }

    public static void toplama(int a,int b){
        int toplam=a+b;
    }
}

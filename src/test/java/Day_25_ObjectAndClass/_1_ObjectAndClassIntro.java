package Day_25_ObjectAndClass;

public class _1_ObjectAndClassIntro {
    public static void main(String[] args) {

        toplama();//Method cagirdik
    }
    // Main methodu gibi bir mthod CLASS icinde method yazmai ogerndik

    public static void toplama(){

    }
}


// ILk olarak method disina cikip method yazdik simdi CLASS disina cikip bir ARABA isminde bir class olusturduk
// Class olusturmanin bir yontemi bu sekilde
class Araba1{
    // Herhangi bir method yazmadan degisken tanimladik.BU degiskenler ClassName ile iliskili ve genel
    // tanima uygun degiskenler
    String model;
    int yili;
    String rengi;
    double kilooomatre;
    String yakitTuru;

    // Araba class in cine bir donus degeri olmayan void bir method yazdim, yazdirma islemi yapiyor
    // static olmadan method create ettik, cunku main methodu ve statik kavrami yok
    public void yazdir (){
        String info ="Arabanin modeli [ "+model+"], Arabanin yili[ "+yili+"], Arabanin rengi ["+rengi+
                "], Arabanin kilometresi ["+kilooomatre+"],Arabanin yakit turu ["+yakitTuru+"]";

        System.out.println("info = " + info);

    }

}

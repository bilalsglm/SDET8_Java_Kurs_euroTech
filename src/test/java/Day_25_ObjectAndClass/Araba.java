package Day_25_ObjectAndClass;

class Araba{
    // Herhangi bir method yazmadan degisken tanimladik.BU degiskenler ClassName ile iliskili ve genel
    // tanima uygun degiskenler
    String model;
    int yili;
    String rengi;
    double kilomatre;
    String yakitTuru;

    // Araba class in cine bir donus degeri olmayan void bir method yazdim, yazdirma islemi yapiyor
    // static olmadan method create ettik, cunku main methodu ve statik kavrami yok
    public void yazdir (){
        String info ="Arabanin modeli [ "+model+"], Arabanin yili[ "+yili+"], Arabanin rengi ["+rengi+
                "], Arabanin kilometresi ["+kilomatre+"],Arabanin yakit turu ["+yakitTuru+"]";

        System.out.println("info = " + info);

    }

}

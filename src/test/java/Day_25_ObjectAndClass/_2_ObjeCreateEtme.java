package Day_25_ObjectAndClass;

public class _2_ObjeCreateEtme {
    public static void main(String[] args) {

        // Nesne olusturmannin yolu: Asamali
        Araba bilalinArabasi;// Fabrikaya siparis verdiniz
        // Sizin adiniza bir araba siparisi verildi ortada araba yok
        bilalinArabasi = new Araba();// Sizin adiniza olan araba uretildi,artik kullanilabilir

        //Nesne olusturmannin yolu: Direkt olarak olusturma

        Araba ramazaninArabasi =new Araba();
        // Araba turunden bir araba uretildi.Yeni arac urettik. Bu aracin ozellikleri

        // bilalinArabasi olarak olusturuluan nesnenin araba class inda ki degiskenelri cevap verdik
        bilalinArabasi.yakitTuru="Diesel"; // String yakit=bilalinArabasi.yakitTuru="Diesel"
        bilalinArabasi.rengi="Su yasili";
        bilalinArabasi.kilomatre=12000.51;
        bilalinArabasi.yili=2020;
        bilalinArabasi.model="BMW";

        System.out.println("Arabamin Yakit Turu: "+bilalinArabasi.yakitTuru);
        System.out.println("Arabamin rengi: "+bilalinArabasi.rengi);
        System.out.println("Arabamin kilometresi: "+bilalinArabasi.kilomatre);
        System.out.println("Arabamin yili: "+bilalinArabasi.yili);
        System.out.println("Arabamin modeli: "+bilalinArabasi.model);

        ramazaninArabasi.yakitTuru="Hybrit";
        ramazaninArabasi.rengi="Portakal";
        ramazaninArabasi.yili=2023;
        ramazaninArabasi.kilomatre=2000.34;
        ramazaninArabasi.model="Mercedes";

        System.out.println("***************************");

        System.out.println("Arabamin Yakit Turu: "+ramazaninArabasi.yakitTuru);
        System.out.println("Arabamin rengi: "+ramazaninArabasi.rengi);
        System.out.println("Arabamin kilometresi: "+ramazaninArabasi.kilomatre);
        System.out.println("Arabamin yili: "+ramazaninArabasi.yili);
        System.out.println("Arabamin modeli: "+ramazaninArabasi.model);




    }

}

package Day_21_Methods_1;

public class _5_methodAmazonExsample {
    public static void amazonAramaMotoru(){
        System.out.println("Amazon sayfasinda Ayakkabilari arat");
    }

    public static void main(String[] args) {
        System.out.println("Main methoduna giris yaptik");
        amazonHomePage();// amazonHomePage methoduna gider --> satir satir ilerler. amazonAramaMotoru methoduna gider
                        //  --> satir satir okur ve icerisindeki amazonAyakkabilariFiltrele methoduna gider-->
                        // methodu okuduktan sonra varsa diger satirlari comile eder
    }
    public static void amazonHomePage(){
        System.out.println("Amazon anasayfasina gittik");
        amazonAramaMotoru();
        amazonAyakkabilariFiltrele();
    }
    public static void amazonAyakkabilariFiltrele(){
        System.out.println("Spor ayakkabilari filtreleyerek goster");
    }
}

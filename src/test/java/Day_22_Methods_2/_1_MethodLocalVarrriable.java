package Day_22_Methods_2;

public class _1_MethodLocalVarrriable {


    public static void exsample(){
        int sayi=10;

        double range=5.6;

        String name= "Bilal";
        // Buuurada tanimlanan degiskenler LOCAL VARIABLE
        // Sadece bu method icerisnde kullanilabilir. Bu degiskenler baska bir method dan cagrilmaz
    }
    public static void main(String[] args) {
        exsample();// Bu methodu parametresiz oldugu iiicin direkt cagirabildik
        exsampleWithParameters(12,35,16);

    }
    // Parametreli bir method tanimladik
    public static void exsampleWithParameters(int   x,int y,int z){
        int toplam = x+y+z; // Local vvvariable --> Burada yer alan x,y,z birer int degeri oldugu icin, toplami bir int
        System.out.println("toplam = " +toplam);

        int yas;// Burada DEFAULT degerine sahip bir LOCAL VARIABLE tanimladik
    }
}

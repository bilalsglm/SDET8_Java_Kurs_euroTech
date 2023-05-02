package Day_21_Methods_1;

public class _3_MethodHiyerarcials {
    public static void mesajiYaz(){

        System.out.println("Meseji yazdir");
    }

    public static void main(String[] args) {
        System.out.println("ilk olarak mesaji yaz methodunu cagir");
        mesajiYaz();// main methodunun uzerinde tanimlamistik
        System.out.println("Methodu gonder methodunu cagir");
        mesajiGonder();// son sirada tanimlanan method
        System.out.println("Mesaji oku methodunu cagir");
        mesajiOku();// main methodu sonrasi tanimlanan mehod
        System.out.println("Tum methodlari yazdirdik");

    }

    public static void mesajiOku(){
        System.out.println("Mesaji oku");
    }
    public static void mesajiGonder(){
        System.out.println("Mesaji Gonder");
    }
}

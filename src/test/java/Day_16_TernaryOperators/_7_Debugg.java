package Day_16_TernaryOperators;

public class _7_Debugg {
    public static void main(String[] args) {

        // Her satiri veya programi satir satir kontrol ederek kosma bicimidir.
        // Kosma RUN etme anlaminda kullanilir.
        // Istenmesi durumda bir breakPoint olusturulur, program breakPoint noktasina kadar calisir ve durur.
        // Adim adim ilerletilerek degisimleri daha net gorerek ilerler,
        // debugg RUN etmek icin, run tusunun yaninda yer alir.

        int a = 10;

        int b = 100;

        a+=150;

        b-=100;

        a++;

        ++b;

        int toplam = a+b;

        toplam--;

        System.out.println("a = "+a+ " b = "+b+" toplam = "+toplam);


    }
}

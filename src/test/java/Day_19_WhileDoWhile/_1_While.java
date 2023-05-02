package Day_19_WhileDoWhile;

public class _1_While {
    public static void main(String[] args) {

       // for(int i=4; i<=21; i++){ // burada sinir belli
         //   System.out.println("i=" +i);
       // }

        int x = 15;
        // For dongusunden farkli olarak sarta bagli donguyu ifade eder
        while (x>10){ // While onceden belli olmayan donguler icin kullanilir.
            System.out.println("Dongu sarti saglaniyor.");
            x--; // Syntex olarak artis ve azalis While statement sonunda yer alir
                // While sarti boolen olarak tanimlanir ve TRUE oldugu surece Kod Blogunu yani suslu parentezi
                // icini calistirir
        }
        // While ile yazilan bir algoritma FOR ile de yazilabilir.
        // SADECE TEK FARK sinirlarin onceden belli olmayan donguler icin WHILE kullnilir(FOR kullinilmaz.)

    }
}

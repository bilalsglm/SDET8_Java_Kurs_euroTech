package Day_18_NestedForLoops;

public class _2_NestedForLoop {
    public static void main(String[] args) {
        // Nested ic ice yazma demektir. Nested ForLoop ise ic ice for dongulerini anlamindadir

        for (int i=1; i<5; i++){
            System.out.println("Burada ilk For");

            for(int j=1; j<4; j++){ //Burada farkli bir loop var. Farkli bir degisken tanimlanmis
                                    // sarti sagladigi surece dongu devam edecek. Bittiken sonra bu for disina cikacak
                System.out.println("Burasi ikinci For");
            }// Burada for susulu parentes disina cikana kadar dongu devam eder ve kendi statment calistirir.
        }

    }
}

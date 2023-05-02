package Day_21_Methods_1;

public class _12_methodIngCasting {
    public static void main(String[] args) {
        double x = 10.45;
        displayValue((int) x);// x degerini yazdirmak istiyorum
        // Cast sadece yukaridaki gibi parentez ile cast edilecek degisken yazilmasi ile mumkun

    }
    // Verilen parametreyi yazdiran bir parametre method yazdik
    public static void displayValue(int num1){
        System.out.println("Num1 = " +num1);
    }
}

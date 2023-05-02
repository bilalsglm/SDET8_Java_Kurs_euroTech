package Day_08_JavaAssigneOperators;

public class _5_relationalOperatorsExsample {
    public static void main(String[] args) {

        // Variable Definition and Initianlization ( degiskeni tanimlama ve ilintilendirme)

        int rakam= 3;
        int sayi=4;
        System.out.println("Rakam ve Sayi birbirine esit mi = "+ (rakam==sayi)); // cikti?->FALSE

        System.out.println("Sayi rakamdan kucuk mu = "+ (sayi<rakam)); // cikti -> FALSE boolean return

        System.out.println("Rakam sayidan buyuk ve degil midir = " + (rakam>=sayi));// cikti->FALSE

        System.out.println("Rakam ve sayi esit degil mi ="+(rakam!=sayi));// cikti TRUE

        System.out.println("Rakam ve sayidan kucuk ve esit mi = "+(rakam<=sayi));//cikti TRUE

        System.out.println("sayi rakamdan buyuk mu ="+(sayi>rakam));// cikti TRUE


    }
}

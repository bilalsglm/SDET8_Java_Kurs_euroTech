package Day_22_Methods_2;

public class _8_methodReturn {
    public static void main(String[] args) {

        System.out.println(toplam(11,20));// Method bir int degeri donecek ve ben method u sout icinde tanimladim
        // Baska bir degisle
        int total= toplam(11,20);
        System.out.println("total = " + total);


    }
    // Bir int degeri donduren yani RETURN iceren bir method tanimladik
    public static int toplam(int x,int y){
        int result =x+y; // Local variable ile parametrellleri kullandik, degisken int
        // Donus degeri INT olmak zorunda. Cunku RETURN type INT
        // Header kisminda return type gorulmektedir.
        //System.out.println("result = " + result);
        return result; // RETURN type degerini vermemiz zorunlu
    }
}

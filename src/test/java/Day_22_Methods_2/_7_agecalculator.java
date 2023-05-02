package Day_22_Methods_2;

public class _7_agecalculator {
    public static void main(String[] args) {
        // currenterYear --> mevcut yil
        // birtYear --> dogum yili
        // Methodname = agecalculator
        // What age?
        ageCalculator(2023,1983);


    }

    public static void ageCalculator(int mevcutYil,int dogumYili){
        int yilHesap= mevcutYil-dogumYili;
        System.out.println(yilHesap);
    }
}

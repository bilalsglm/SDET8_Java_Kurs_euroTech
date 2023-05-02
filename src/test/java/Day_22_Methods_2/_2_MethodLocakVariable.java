package Day_22_Methods_2;

public class _2_MethodLocakVariable {
    public static void main(String[] args) {
        int yas =12;
       // int yas=25; int gerek yok

        toplama(18,55);

    }
    public static void toplama(int toplam,int sayi){
        //int sayi =10; // Bir degisken hem parametre hemde local verable olarak ayri ayri tanimlanamaz

       // int sayi veya int toplam-->sadece degiskenin degerini atayip veya degistirebiliriz

        toplam =25;

        toplam =   toplam+sayi; // toplam+=sayi;


        System.out.println("toplam = " + toplam);

    }
}

package Day_12_ifStatement;
public class _2_ifStatement {
    public static void main(String[] args) {
        int sayi1 =2;
        int sayi2=-5;

        if ( sayi1>0)// Eger if statement sonra bir satirlik kod yazarsaniz suslu paranteze gerek yok
            System.out.println("Sayi Pozitif");

        if (sayi2<0)
            System.out.println("Sayi2 negatiftir");

        if (sayi2>sayi1){
            sayi2=34;
            int sayi3;// premitive data tanimladim. Yani bir int degiskeni veya kab olustrudu
            sayi3 =sayi1+sayi2;// Burada bu tanimlanan degiskene deger atadim
            System.out.println(sayi3);
        }
        int sayi3=23;// Yukaridaki tanimlanan degisken sadece gecerli kosul icin ve farkli bir susulu parentez icin
        System.out.println(sayi3);
    }
}

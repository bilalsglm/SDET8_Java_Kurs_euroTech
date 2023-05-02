package Day_32_Arrays;

public class _1_introduction {
    public static void main(String[] args) {
        int sayi; // declaration aptik.Tek bir deger alabilen degisken turudur.
        sayi = 5;
        String car ="Honda";//Bir string declaration yaptiniz ve bu da car ismi ile TEK bir deger atabiliyor.
                            //Farkli bir deger verdiginde oncekinin yerine gecer.

        // birden fazla deger atayabildigimiz bir SERI veya DIZI degiskeni asagida tanimladik
        int [] sayilar =new int[5];// bir dizinin declaration hali.
        // syntex olarak koseli parantez ile tanimlanir. ve MUHAKKAK dizi sayisi atanmalidir.ZORUNLU

        //ukaridakinin direkt degertanimlanarak ifade edilme sekli
        int [] rakamlar={1,6,4,8,12};// Bu da kac tane deger tanimladigini bu sekilde declaration yapabiliriz.

        int [] numbers;
        numbers = new int[12];//Burda 12 int deger alabilen bir dizi tanimladik


        String car1="Toyota";
        String car2="Mercedes";
        String car3="BMW";
        String car4="Honda";

        String [] cars ={"Toyota","Mercedes","BMW","Honda"};// Dort string degeri alan bir string DIZI olusturduk

        String [] arabalar = new String[4];//4 elementli bir dizi tanimladik. SABIT bir uzunluk tanimlar.yani 4

        //4 element alabilen dizinin deger atamasi asagidaki gibidir

        arabalar [0] ="Toyota";// ilk deger atamasi yaptik
        //arabalar [1] ="Mercedes";
        //arabalar [2] ="BMW";
        arabalar [3] ="Honda";
        //Element ayni index gibi SIFIR dan baslar. ilk elementin indexi 0 dir.
    }
}

package Day_12_ifStatement;

public class _4_ifElseStatement {
    public static void main(String[] args) {

        int sayi = -4;
        if(sayi==0)
            System.out.println("Sayi sifirdir");
        if(sayi<0)
            System.out.println("Sayi negatiftir");
        if(sayi>0)
            System.out.println("Sayi pozitiftir");
        // Bir degerin kosullarini saglamasi durumu ifade etmek icin if statement kullaniyoruz.
        // Bu kosulun disinda kalan durumu ifade etmek nasil olur?
        // DIGER TUM DURUMLARI ifade etmek icin ELSE kullaniriz. Kosul disinda kalana yani DEGILI

        int ogrKayit=8;
        //ilkokul ogrenci kaydi icin
        if(ogrKayit>=7 && ogrKayit<=15){

            System.out.println("ilkogretime kayit yaptirabilir");

        }else{ // if kosulu gibi bir kosul ifade eden ve suslu parantez ile tanimlanan statement dir
            // else TEK basina kullanilamaz
            System.out.println("ogrenci oklumuza kayit yaptirma sarti saglamiyor");
        }
    }

}

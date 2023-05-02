package Day_35_2DArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _3_2DPrint {
    public static void main(String[] args) {

        String [] kelimelr={"Bilal","Ahmet","Mehmet"};
        // Yazdirma for ile
        for (int i = 0; i < kelimelr.length; i++) {
            System.out.println(kelimelr[i]+" ");
        }
        System.out.println("-----------------------");
        // Foreach ile yazdirma
        for (String s : kelimelr) {
            System.out.print("s = "+s);
        }
        System.out.println("------------------------");
        // Array iceriisndeki tosrting() method ile
        System.out.println(Arrays.toString(kelimelr));

        int [][] tablo1={{1,2,3},{4,5,3},{2,7,9}};

        int [][] tablo= new int[3][3];
        tablo[0][0]=4;
        System.out.println("tablo[0][0] = " + tablo[0][0]);

        for (int satir = 0; satir < tablo1.length; satir++) {
            for (int stun = 0; stun < tablo1[satir].length; stun++) {
                System.out.println(satir+"´inci satiri :"+stun+"´inci stun degeri: "+tablo1[satir][stun]);
            }

        }

        //String type olan 5x5 arry creat edin

        String [][] tax=new String[5][5];

        //LENGHT
        int[] sayi ={1,6,10,34};

        //uzunluk--> eleman sayisi
        System.out.println(sayi.length);

        int [][]sayilar1 ={{1,2,4},{5,7,9},{12,45,23}};
        //sayilar1.length--> sizin eleman siyisini verir.ELEMAM SAYISI = SATIR SAYISINA ESITTIR
        // yani sayilar1.length derseniz satir sayisini verir.

        System.out.println("sayilar1.lenght= "+sayilar1.length);

        //Bu elemanlarin icerisindeki degerleri yani stunlarin uzunlugunu nasil buluruz
        //Sifirinci index de yer alan elemanin UZUNLUGU YANI ---> STUN SAYISI
        System.out.println("sayilar1.length[0] = " + sayilar1[0].length);
    }
}

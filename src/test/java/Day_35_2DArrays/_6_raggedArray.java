package Day_35_2DArrays;

import java.util.Arrays;

public class _6_raggedArray {
    public static void main(String[] args) {
        int [][] sayilar= new int[3][4];// zorunlu olan ve ilk kutu satirdir
        System.out.println(Arrays.deepToString(sayilar));

        int [] ciftSayilar = {12,46};

        sayilar[1]=ciftSayilar;
        System.out.println(Arrays.deepToString(sayilar));

        int [] tekSayilar = {11,45,77,34};
        sayilar[0]=tekSayilar;
        System.out.println(Arrays.deepToString(sayilar));

        int [] asalSayilar=new int[7];
        asalSayilar[0]=13;
        asalSayilar[1]=2;
        asalSayilar[2]=3;
        asalSayilar[3]=53;
        asalSayilar[4]=73;
        asalSayilar[5]=33;
        asalSayilar[6]=31;

        sayilar[1]=asalSayilar;

        sayilar[2]=asalSayilar;

        System.out.println(Arrays.deepToString(sayilar));
    }
}

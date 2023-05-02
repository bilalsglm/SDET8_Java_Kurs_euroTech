package Day_37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _3_ArrayList {
    public static void main(String[] args) {
        //Deger atamanin farkli bir sekli
        ArrayList<Integer> sayilar= new ArrayList<>(Arrays.asList(15,4,6,11,44,87));
        //Burada aslinda br belirli olan diziyi ArrayList e atadik

        System.out.println("Dizinin eleman sayisi :"+sayilar.size());

        System.out.println("sayilarin 3 uncu elamani = "+sayilar.get(1));

        sayilar.add(32);
        sayilar.add(sayilar.size());

        System.out.println("Yeni eklemeler sonrasi sayilar = " + sayilar);


    }
}

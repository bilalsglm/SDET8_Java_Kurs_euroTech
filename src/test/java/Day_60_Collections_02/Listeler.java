package Day_60_Collections_02;

import java.util.*;

public class Listeler {
    public static void main(String[] args) {

        List<String> sehirler =new ArrayList<>();

        //Normal liste
        sehirler.add("oslo");
        sehirler.add("Istanbul");
        sehirler.add("Londra");
        sehirler.add(3,"Antalya");
        System.out.println("1. elment degismeden sehirler = " + sehirler);
        sehirler.add(0,"Bolu");//update oldugu icin set methodunu kullandik
        Collections.sort(sehirler);
        System.out.println("sehirler = " + sehirler);
        //sehirler.clear();
        System.out.println("en son hali sehirler = " + sehirler);


        //LinkedList
        List<Integer> rakamlar=new LinkedList<>();
        rakamlar.add(100);
        rakamlar.add(90);
        rakamlar.add(10);
        rakamlar.add(25);
        rakamlar.add(44);
        rakamlar.add(20);
        System.out.println("Lindexlist olarak rakamlar = " + rakamlar);
        Collections.sort(rakamlar);
        System.out.println("sort mthodundan sonra rakamlar = " + rakamlar);


        List<String> ulkeler=new Vector<>();
        // System.out.println("ulkeler.size() = " + ulkeler.size());
        ulkeler.add("Turkiye");
        ulkeler.add("Almanya");
        System.out.println("ulkeler.size() = " + ulkeler.size());
        Collections.sort(ulkeler);
        ulkeler.addAll(sehirler);
        System.out.println("ulkeler = " + ulkeler);


    }
}

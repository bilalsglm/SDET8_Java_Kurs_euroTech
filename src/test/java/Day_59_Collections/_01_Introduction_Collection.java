package Day_59_Collections;

import java.util.ArrayList;
import java.util.List;

public class _01_Introduction_Collection {
    public static void main(String[] args) {
        List<String> sehirler=new ArrayList<>();// BU bir pholymorphism yapisi ile kurulan String liste
        sehirler.add("Samsung");
        sehirler.add("Agri");
        sehirler.add("Oslo");


        String ulkeler[]=new String[]{"Turkiye","Almanya","Hollanda","Avusturya"};//Fixed size Array

        System.out.println("sehirler = " + sehirler);//Arraylist bu sekilde yazdirilabilir
        System.out.println(sehirler.toString());

       // System.out.println("ulkeler = " + ulkeler);//BU sekilde YAZDIRILAMAZ

        for (String s:ulkeler) {
            System.out.println("s = " + s);//ForEach ile yazdirilabilir
        }
    }
}

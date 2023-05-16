package Day_60_Collections_2;

import java.util.*;

public class _04_Sets {

    public static void main(String[] args) {

        // SETS : LinkedHashSet, HahSet, ThreeSet

        //Container islemindeki siralama ile ilgilidir. Ekleme bicimleri ve listelemede kullanilmaktadir

        //Hash algoritmasina bagli ekleme yapar ve siralar

        Set<String> hashSetList=new HashSet<>();
        hashSetList.add("Bir");
        hashSetList.add("Iki");
        hashSetList.add("Uc");
        hashSetList.add("Dort");
        hashSetList.add("Bes");
        System.out.println("hashSetList = " + hashSetList);


        //Ekleme sirasina gore elementleri saklar
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Bir");
        lhs.add("Iki");
        lhs.add("Uc");
        lhs.add("Dort");
        lhs.add("Bes");
        System.out.println("lhs = " + lhs);

        //Alfabetik siraya gore elementlerin saklar
        TreeSet<String> trhs=new TreeSet<>();
        trhs.add("Bir");
        trhs.add("Iki");
        trhs.add("Uc");
        trhs.add("Dort");
        trhs.add("Bes");
        System.out.println("trhs = " + trhs);


        //Integer degerleri kucukten buyuge siralar
        TreeSet<Integer> integerTreeSet=new TreeSet<>();
        integerTreeSet.add(4);
        integerTreeSet.add(9);
        integerTreeSet.add(23);
        integerTreeSet.add(456);
        System.out.println("integerTreeSet="+integerTreeSet);

        Integer[] dizi={1,2,3,4,5,5,4};//Bir dizi tanimladik

        HashSet<Integer> hs1=new HashSet<>(Arrays.asList(dizi));//Burada diziyi SET e atadik
        HashSet<Integer> hs2=new HashSet<>(Arrays.asList(1,8,3,4));
    }
}

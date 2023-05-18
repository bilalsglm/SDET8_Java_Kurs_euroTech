package Day_61_Collections_03;

import java.util.Arrays;
import java.util.HashSet;

public class _03_Lambda_Stream {
    public static void main(String[] args) {

        //1- Burada hashset olarak bir dizi atayarak tanimladik
        Integer [] dizi={1,7,3,2,5,6,9,4,8};
       // HashSet<Integer> hs= (HashSet<Integer>) Arrays.asList(dizi);

        HashSet<Integer> hs1=new HashSet<>();
        hs1.addAll(Arrays.asList(dizi));// Bu cast olmadan ekleme islemleni yaptik

        //hs1.stream().forEach(user::talk);//Bu syntex ile fonksiyonun sadece adi yazilir
        //talk() DEGIL talk olarak yazlir ve "::" iki nokta ust uste iki kez yazilarak kullnilir

        hs1.stream().forEach(user-> System.out.println(user.hashCode()));
    }
}

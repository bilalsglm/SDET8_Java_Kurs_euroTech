package Day_61_Collections_03;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class _01_Stream_Lambda {

    public static void main(String[] args) {


        List<String> sehirler =new Stack<>();
        sehirler.add("Istanbul");
        sehirler.add("Izmir!");
        sehirler.add("Bolu");
        sehirler.add("Urfa");
        sehirler.add("Antep!");
        sehirler.add("Diyarbakir");

       sehirler.stream().forEach(x->{System.out.println("Mehaba Stream");System.out.println(x.toString());});

        sehirler.stream().filter(a-> a.length()>5);

        System.out.println("****************");
        //Uzunluklari 5 den buyuk olan elemenltlerin yeni listeye atadik
        List<String> yeniListe=sehirler.stream().filter(a->a.length()>5).collect(Collectors.toList());

        System.out.println(yeniListe);

        sehirler.stream().forEach(a-> System.out.println(a));

        //Stream ve Lamda ile bir seri uzerindeki akisi ifade eden ve farkli methodlari
        // uygulamamzi kisa bir yoldan uygulamamizi saglar

        System.out.println("sehirler.stream().filter = " + sehirler.stream().filter(s -> s.contains("!")).count());








    }
    public static void aa(String st){
        if (st.length()>5){

        }
    }
}

package Day_28_Collection;

import java.util.Scanner;

public class _1_SrtingNext {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen birstring giriniz");

//        String cumle= scanner.next();// daha once nextline kullandik fakat next secenegi de var. Eger bunu kullnirsak
//        String cumle2=scanner.next();
//        System.out.println("cumle = " + cumle);
//        System.out.println("cumle2 = " + cumle2);

        // Next yazilan cumledeki kelimelri tek tek yazdirir.
        // Her kelime icin bir next gerekir

//        String kelime1=scanner.next();
//        String kelime2=scanner.next();
//        String kelime3=scanner.next();
//        String kelime4=scanner.next();

        //System.out.println("Cumle = "+kelime1+kelime2+kelime3+kelime4);


        String cumle=scanner.nextLine();
        System.out.println("cumle = " + cumle);

        // NEXT ve NEXTLINE arasinda temel fark--> next() ne yazarsan yaz bosluga kadar olan kelimeyi tek tek alir ve kullanir
                                                  // nextline() ise ne yazarsan hepsini alir ve okur. Genelde bu kullnilir.

//        String name =scanner.next();
//        System.out.println("name = " + name);


    }
}

package Day_60_Collections_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _0_Iterator {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Gulden");
        isimler.add("Selim");
        isimler.add("Ramazan");
        isimler.add("Symbat");
        isimler.add("Ayse");
        isimler.add("Bilal");
        isimler.add("Ismail");
        isimler.add("GuldenT");

        Iterator<String> iterator = isimler.iterator();

        //System.out.println(itr.hashCode());//hashCode verilen degerin karekter olarak byte
                            // code aktarilan sayi deegrini verir,yani 0:1 degerini donusmeden onceki hali

        while (iterator.hasNext()) {
            String eleman = iterator.next();
            System.out.println(eleman);
        }

    }
}

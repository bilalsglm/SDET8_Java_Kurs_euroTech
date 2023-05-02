package Day_37_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _2_example {
    public static void main(String[] args) {
        //ArrayList bir Collection grubunun bir elemnidir
        //Sort ile burda da siralama yapiliyor.ANCAK-->Collection.sort(list);

        ArrayList<Integer> rakamlar = new ArrayList<Integer>()
        {
            {
               add(3);
               add(12);
               add(1);
               add(24);

            }
        };

        rakamlar.add(9);
        System.out.println("rakamlar = " + rakamlar);

        Collections.sort(rakamlar);
        System.out.println("sort sonrasi rakamlar = " + rakamlar);

        Collections.reverse(rakamlar);
        System.out.println("Listenin tersi rakamlar = " + rakamlar);

        Collections.fill(rakamlar,8);
        System.out.println("tum elemanlara ayni deger atanmasi rakamlar = " + rakamlar);

        Collections.replaceAll(rakamlar,8,9);
        System.out.println("yeniden deger atanan rakamlar = " + rakamlar);

    }
}

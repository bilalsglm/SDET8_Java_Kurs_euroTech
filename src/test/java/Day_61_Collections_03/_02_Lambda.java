package Day_61_Collections_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _02_Lambda {

    public static void main(String[] args) {
        List<String> ulkeler=new ArrayList<String>(){{
            add("Germany");
            add("England");
            add("Finland");
            add("USA");
            add("Turkey");
        }};
         ulkeler.get(2).length();
        Iterator asIteratorList=ulkeler.iterator();
        while (asIteratorList.hasNext()){
            System.out.println("asIteratorList.next() = " + asIteratorList.next());
        }
    }
}

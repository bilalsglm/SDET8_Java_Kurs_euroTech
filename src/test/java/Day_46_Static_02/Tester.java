package Day_46_Static_02;

import java.sql.Array;
import java.util.ArrayList;

public class Tester {
    String m ="m";
    static String deger="d";
    static {
        deger+="s";
    }
    {
        deger+="t";
    }
    Tester(){
        deger+="o";
        m="m1";
    }
    Tester (String str){
        deger+=str;
        m="f";
    }

}

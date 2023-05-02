package Day_18_NestedForLoops;

public class _1_ForLoopsRules {
    public static void main(String[] args) {

        long x, y;
        //long y;
        for (x = 1, y = 3; x <= 2 && y <= 3; x++, y++) { // Dongunun sarti olmaliydi. bu ayni zamanda siniri belli olan demek
            System.out.println("Selam");
        }
        // iki degisken tanimlayip sartina ikisinide ekleyebiliriz. burada y=3 oldugu icin ve sartta y<=oldugundan
        // dongu bir key donecektir.

        //long x = 2;
        //int y = 1;
        //for (; x<4 && y < 2; x++, y++) {
          //  System.out.println("Merhaba");
        //}

    }
}

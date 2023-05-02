package Day_16_TernaryOperators;

public class _2_ternaryOperators {
    public static void main(String[] args) {

        int x,y;

        x=20;

        // Ternary operator x egore y degiskenini deger atama
        // x cift ise y=61, degilse y=95
        y=(x%2==0)? 61 : 95;
        System.out.println("y= "+ y);

        // IF-ELSE gore tanimlama
        if (x%2==0){
            y=61;
            System.out.println("y= "+ y);
        }else
        {
            y=95;
            System.out.println("y= "+ y);
        }


    }
}

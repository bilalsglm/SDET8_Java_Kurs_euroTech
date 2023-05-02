package Day_17_ForLoopsItnro;

public class _5_ForLoopPrintTable {
    public static void main(String[] args) {

        // Nummer     NummerSquared
        // 1             1
        // 2             4
        // 3             9

        // 1 den 10a kadar sayilari yaziniz

        System.out.println(" Nummer       NummerSquared");
        System.out.println("________       ____________");

        for(int num=1; num<=10; num++){
            System.out.println("  "+ num +"\t\t\t\t   " + num*num);
        }




    }
}

package Day_17_ForLoopsItnro;

public class _7_ForLoopMultiplicationTable {
    public static void main(String[] args) {

        int num =10;

        System.out.println(" Multiplication Table for =" + num);

        // Beklenen cikti(Expected Result)

        /*
        1 x 10 = 10
        2 x 10 = 20
         */
        // burada sizin ihtiyaciniz olan numaralarin 1 den 10 a kadar alt alta carpim seklinde 10 carpimini gortermek

        for( int i =1; i<=10; i++){
            System.out.println(i + " X " + num + " = " + i*num);
        }




    }
}

package Day_13_ifElseIf;

public class _1_ifElseIf {
    public static void main(String[] args) {

        // 1-Bir sayinin 100 den kucuk olmayi durumuna bakiniz
        // 2-saynin  50 den buyuk olma durumuna bakiniz

        // 3-Sayi hem 100 den kucuk hemde 50 den buyuk olmmma durumuna bakiniz
        // 4-Sayinin hem 50 den buyuk hemde   100 den kucuk olma durumuna bakiniz

        int sayi =43;
        // 1.satir
        if(sayi<100){
            System.out.println("Veriline sayi 100 den kucuktur...");
            if(sayi>50){ // 1.ve 2. kosul saglamsi durumunda
                System.out.println("Sayinin hem 100 den kucuk hem de 50 den buuk olma durumu");
            }
        }
        //2.satir
        if (sayi>50)
        {
            System.out.println("Verilen sayi 50 den buyukturrr...");

            if(sayi<100){
                System.out.println("Verilen sayi hem 50den buyuk hem de100 kucuk");
            }
        }
    }
}

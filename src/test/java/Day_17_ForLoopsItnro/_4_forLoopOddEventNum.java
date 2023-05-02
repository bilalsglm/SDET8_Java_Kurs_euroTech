package Day_17_ForLoopsItnro;

public class _4_forLoopOddEventNum {
    public static void main(String[] args) {

        // 1 den 100 kadar cift ve tek sayilari ayri ayri toplamlarini yazdirin

        int oddTotal=0;
        int evenTotal=0;

        for (int i=1; i<=100; i++){
            if(i%2==0)
            {
                evenTotal+=i;
            }else {
                oddTotal+=i;
            }

        }
        System.out.println("evenTotal= " + evenTotal);
        System.out.println("oddTotal= " + oddTotal);
    }
}

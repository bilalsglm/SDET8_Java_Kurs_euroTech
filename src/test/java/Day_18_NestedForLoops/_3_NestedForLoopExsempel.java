package Day_18_NestedForLoops;

public class _3_NestedForLoopExsempel {
    public static void main(String[] args) {

        for (int i=0; i<3; i++){
            System.out.println("Outer Loop at state:"+ i);

            for (int j=0; j<4; j++){
                System.out.println("Inner Loop at state:"+ j);
            }
            System.out.println();
        }
    }
}

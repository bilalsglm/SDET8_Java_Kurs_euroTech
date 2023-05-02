package Day_18_NestedForLoops;

public class _8_BreakForLoop {
    public static void main(String[] args) {
          for ( int i=2; i<=5; i++){
              System.out.print(i);
              if (i==3){
                  System.out.print(" Sihirli sayiyi buldunuz.");
                  break;
              }
              System.out.println();
          }
    }
}

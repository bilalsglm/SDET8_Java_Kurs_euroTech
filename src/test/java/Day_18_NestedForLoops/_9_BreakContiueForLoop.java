package Day_18_NestedForLoops;

public class _9_BreakContiueForLoop {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            if (i ==4){
                //System.out.println(" Burada kirilma olacak");
                //break;
                continue;// devam anlamindadir( buradaki satiri ATLA), kod calismaya devam eder.
                // FAKAT--> Buradaki DEVAM bu sarti yazdirmadan ilrle anlamindadir.
            }
            System.out.println(i);
        }
    }
}

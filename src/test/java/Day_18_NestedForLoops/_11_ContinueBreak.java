package Day_18_NestedForLoops;

public class _11_ContinueBreak {
    public static void main(String[] args) {

         // Saat ,dakika ve saniye dagilimi gosteren donguyu yaziniz saat: dk: saniye: 01:59:59


        for( int hour=0; hour<=12; hour++){

            for(int minute=0; minute<=59; minute++){

                //System.out.println("%02d:%02d",hour,minute);
                System.out.println("Minutes ="+ minute);
                for ( int second=0; second<=59; second++){
                    System.out.printf("%02d:%02d:%02d\n", hour,minute,second);

                }
            }
            System.out.println();
        }


    }
}

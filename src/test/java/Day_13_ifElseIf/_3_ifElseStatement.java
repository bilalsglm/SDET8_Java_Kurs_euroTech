package Day_13_ifElseIf;

public class _3_ifElseStatement {
    public static void main(String[] args) {
         // Burada ic ice if degerlerinin yaninda DEGILI olan kisim icin bu if sartlarinin eklenme durumuna
        // if-else-if-else akisi veya nested olarak tanimlanir

        int scor =95;

        if (scor>=90){
            System.out.println("Scor A");
        }else // 90 puani ve uzeri disindaki tum alinan punlari tanimlar
            if(scor>=80){ // 80 den 89 a kadar alinan puani ifade eder
                System.out.println("Scor B");
        } else// 80 puani ve uzeri disindaki tum alinan punlari tanimlar
            if (scor>=70) {
                System.out.println("Scor C");
            } else // 70 puani ve uzeri disindaki tum alinan punlari tanimlar
                if (scor>=60) {
                System.out.println("Scor D");
            } else // 60 puani ve uzeri disindaki tum alinan punlari tanimlar
            {
                System.out.println("Basarisiz");
            }


    }
}

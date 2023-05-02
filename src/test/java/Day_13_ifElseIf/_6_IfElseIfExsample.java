package Day_13_ifElseIf;

public class _6_IfElseIfExsample {
    public static void main(String[] args) {

        int age=25;
        int sayi=35;
        if(sayi<100){
            System.out.println("Gecerli sayi");
            if(sayi>45){
                System.out.println("Ozel sayi");
            } else // sayinin 45 den OLMAMA durumlarini ifade eder
                if (sayi==35) {
                    System.out.println("Omur yarisini ifade eden sayi");
            } // WRONG ANSWER => HATALI CEVAP => asagidaki else bakarak, sayinin 35e esit olmama durumunu ifade eder.****
        }else// sayinin 100 den kucuk olmama durumlarini ifade eder
            System.out.println("Gecersir sayi");

    }
}

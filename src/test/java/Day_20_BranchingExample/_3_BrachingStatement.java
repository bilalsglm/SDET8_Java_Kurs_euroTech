package Day_20_BranchingExample;

public class _3_BrachingStatement {
    public static void main(String[] args) {
        int sayi = 0;
        int num =0;

        while (sayi<=10){
            System.out.println("num = " + num);
            num=num+sayi;
            if(num>=45){
                // break;
                // continue; her ikisi icin de kendinden sonraki Statement okumuyor.
                System.out.println("num = " + num);
                System.out.println("sayi = " + sayi);
            }
        }
    }
}

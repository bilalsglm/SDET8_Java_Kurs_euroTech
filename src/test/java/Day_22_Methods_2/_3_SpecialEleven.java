package Day_22_Methods_2;

public class _3_SpecialEleven {
    public static void main(String[] args) {
        int yas;
//        if(yas>=18){
//
//    }--> burada yas degeri atanmadan cccalsimaz
        spppecialEleven(22);

    }

    public static void spppecialEleven(int number) {

        if(number%11==0 || (number - 1)%11==0 || number%11 == 1){
           System.out.println(true);
       }else{
           System.out.println(false);}
    }

}

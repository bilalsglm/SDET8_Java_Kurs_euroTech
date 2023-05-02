package Day_22_Methods_2;

public class _4_MethodParameters {

    public static void main(String[] args) {
        deerPlay(60,true);
        deerPlay(90,true);


    }

    public static void deerPlay(double temp, boolean isSummer){
        if (isSummer){
            if (temp>60 && temp<100){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }else {
            if(temp>60&& temp<90){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
}

package Day_17_ForLoopsItnro;

public class _6_forLoopRepeat {
    public static void main(String[] args) {

        int num1= 50;
        int num2= 24;
        int repeat= 4; // tekrar , tekrar sayisi
        // sayinin buyuk mu kucuk mu veya esitmi tekrar sayisinca durumlrini yazdiriniz

        for(int i=1; i<=repeat; i++){

            if(num1>num2){
                System.out.println("number is greater than number2");
            }else if(num1<num2){
                System.out.println("number1 is smaller than number2");
            } else if (num1==num2) {
                System.out.println("number1 is equal to number2");
            }
            System.out.println((num1>num2) ? "number is greater than number2": num1<num2 ? "number1 is smaller than number2" : "number1 is equal to number2");


        }



    }
}

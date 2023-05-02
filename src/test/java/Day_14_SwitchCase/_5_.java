package Day_14_SwitchCase;

import java.util.Scanner;

public class _5_ {
    public static void main(String[] args) {

        // artik yil hesaplayan ve ekrana yazan bir program yazalim

//        int year=2028;
//        int rest = year%4;
//
//        switch (rest){
//            case 0:
//                System.out.println("Bu yil artik bir yildir,subat ayi 29 gundur.");
//                break;
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Bu yil artik yil degildir,subat ayi 28 gunudr.");
//        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        //WRITE YOUR CODE HERE:


        if(num1==num2){
            System.out.println(num1+" & "+num2+" are equal");
        }else if(num1>num2){
            System.out.println(num1+" less than "+num2);
        }else if(num1<num2){
            System.out.println(num1+" greater than "+num2);
        }


    }
}

package Day_14_SwitchCase;

import java.util.Scanner;

public class _1_SwitchCase {
    public static void main(String[] args) {
//        String city="Konya";
//
//        switch (city){
//            case "Ankara":
//                System.out.println("Bu sehirde deprem olmamistir");
//                break;
//            case "Adiyaman":
//                System.out.println("Bu sehirde deprem yasanmistir");
//                System.out.println("Bu sehirde 4000 kisi vefat etmistir");
//                break;
//            case "Hatay":
//                System.out.println("Bu sehirde deprem olmustur");
//                break;
//            default:
//                System.out.println("Bu sehirde deprem riski yoktur.");
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();

        //WRITE YOUR CODE HERE

        switch (day){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;

            case 3:
                System.out.println("Today is Wednesday");
                break;

            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Toda is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("wrong number");

        }


    }
}

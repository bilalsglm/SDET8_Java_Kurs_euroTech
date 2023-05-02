package Day_31_StringMethod.Odev;

import java.time.LocalTime;
import java.util.Scanner;

public class dg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();

        //WRITE YOUR CODE HERE


        if(age>6 && age <=7){
            System.out.println("young reader");
        }else if(age<=10){
            System.out.println("elementary");
        }else if (age<=12){
            System.out.println("middle");
        }else if(age<=13){
            System.out.println("impossible");
        }else if (age<=16){
            System.out.println("high school");
        }else if (age<=18){
            System.out.println("scholar");
        }else{
            System.out.println("ineligible");
        }

    }
}

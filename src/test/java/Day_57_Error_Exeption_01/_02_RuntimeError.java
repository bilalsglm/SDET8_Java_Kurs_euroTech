package Day_57_Error_Exeption_01;

import java.util.Scanner;

public class _02_RuntimeError {
    public static void main(String[] args) {


        String abc=null;
        abc.substring(2,4);

        Scanner sc=new Scanner(System.in);
        System.out.println("1.Sayiya Griniz : ");
        int a = sc.nextInt();

        System.out.println("2. Sayiyi Giriniz : ");
        int b = sc.nextInt();

        System.out.println(a/b);
    }
}

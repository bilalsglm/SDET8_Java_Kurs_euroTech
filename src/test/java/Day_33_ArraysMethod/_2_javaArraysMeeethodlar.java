package Day_33_ArraysMethod;

import java.util.Arrays;

public class _2_javaArraysMeeethodlar {
    public static void main(String[] args) {
        // Arrays.toString(dizi)---> diziyi direkt olarak yazdirma methodu

        String[] name={"Ayse","Gulden","Tazeoglu","Suheda","Bilal","Selim","Ramazan","Ali"};
        //Foreach ile yazdirma
        for (String s : name) {
            System.out.println("s = " + s);
        }

        //toString methodu ile yazdirma
        System.out.println("toString ile yazidrma islem ciktisi :"+Arrays.toString(name));

        // Arrays.sort(dizi)--> Dizinin elementttlerini siralar

        Arrays.sort(name);
        System.out.println(".sort edildikten sonra cikti :"+Arrays.toString(name));

        int[] dizi1={1,2,3};
        int[] dizi2={1,2,3};
        int[] dizi3={1,2,4};
        //Arrays.equals(a,b) --> iki dizinin tum elementlerinin esit olup olmadigini kontrol eder. Boolean sonuc
        System.out.println("dizi1 ile dizi2 birbirine esit mi :"+Arrays.equals(dizi1,dizi2));//TRUE veya FALSE
        System.out.println("dizi3 ile dizi2 birbirine esit mi :"+Arrays.equals(dizi3,dizi2));

        //Arrays.fill(dizi, deger)
        int[] sayilar= new int[5];
        Arrays.fill(sayilar,7);
        System.out.println("Default degeri olan bes elementli int dizisinin ayni degeri atadik:"+Arrays.toString(sayilar));
    }
}

package Day_35_2DArrays;

import java.util.Arrays;
import java.util.Random;

public class _4_example {
    public static void main(String[] args) {

        //4 ogrencinin 4 dersten aldigi buanlari gosteren int bir 2D creat edin
        //10 ile 100 arasi degerler verin.Ardindan her ogrenci icin
        // ayri ayri tum derslerden aldigi puanlarin toplamlarini hesaplayiniz

        int [][] scores =new int[4][4];

        for (int satir = 0; satir < scores.length; satir++) {
            for (int stun = 0; stun < scores[satir].length; stun++) {

                //score degerlerini random olarak atadik
                Random rd =new Random();
                int not= scores[satir][stun]=rd.nextInt(100-10+1)+10;
                System.out.println("not = " + not);

            }

        }

        // deeptoString 2D dizilerde yazdirma methodu olarak java kutuphanesinde yer aliyor
        System.out.println("2D array lerin yazdirma methodu ile cikti :"+ Arrays.deepToString(scores));


        for (int satir = 0; satir < scores.length; satir++) {
            for (int stun = 0; stun < scores[satir].length; stun++) {

                System.out.println("iki for ile 2D dizinin ciktisi :"+scores[satir][stun]);
            }
        }

        // Bilinen tek boyutlu dizinin bilgisiyle yazdirma
        for (int[] score : scores) {
            System.out.println(Arrays.toString(score));

        }

      //  [32, 78, 61, 76]
        //[59, 84, 28, 35]
        //[87, 42, 47, 29]
        //[11, 77, 36, 35]

        }


    }

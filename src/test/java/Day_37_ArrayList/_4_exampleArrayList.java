package Day_37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _4_exampleArrayList {
    public static void main(String[] args) {
        //Bir ogretmenden istedigi kadar not aliniz ve alinan notlarin ortalamasini gecen ogrenci sayisini bulunuz

        ArrayList<Integer> notlar =new ArrayList<>();

        Scanner scNot =new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);

        String davamMi;
        int sum=0;
        do {
            System.out.print("Lutfen not giriniz : ");
            int ogrNot=scNot.nextInt();
            notlar.add(ogrNot);

            sum+=ogrNot;

            System.out.print("Devam mi : E/H ");
            davamMi=scanner.nextLine();

        }while (davamMi.equalsIgnoreCase("E"));

        double ortalama=sum/notlar.size();

        int counter=0;
        for (int i = 0; i < notlar.size(); i++) {
            if(notlar.get(i)>ortalama){
                counter++;

            }
        }
        System.out.println("Girilen ogr notlar = " + notlar);
        System.out.println("Notlarin ortalamasi : "+ortalama);
        System.out.println(notlar.size()+" ogrenciden ortalamayi gecenlerin sayisi = " + counter);

    }
}

package Day_60_Collections_02;

import java.util.HashSet;
import java.util.Random;

public class _HomeWork_1 {
    //Soru 1: Bir HashSet random olarak 10 adet element olacak sekilde
    //1 den 20 e kadar olan sayilara doldurun
    //fonksiyonu yaziniz. Set i main de yazdiriniz

    public static void main(String[] args) {
        HashSet<Integer> set = getRandomNumbers(10, 1, 20);
        System.out.println(set);
    }

    public static HashSet<Integer> getRandomNumbers(int count, int min, int max) {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();

        while (set.size() < count) {
            int number = random.nextInt(max - min + 1) + min;
            set.add(number);
        }

        return set;
    }
}

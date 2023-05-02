package Day_19_WhileDoWhile;

public class _5_WhileDoWhileForExercises {
    public static void main(String[] args) {
        //int sum = 0;
        //for (int i = 0; i <= 4; i++) {
          //  if (i % 3 == 0) // if sonrasinda TEK satirlik bir islem icin zorunlu degil, sadece ilk satiri sarti algilar
            //    continue;
            //sum += i;// sum=sum+i;
            //System.out.println("i =" + i);
        //}
        // OUTPUT kisminda: Process finished with exit code 0 gordugunuzde CODE BASARILI calsiti demektir

        int sum=0;
        int i=0;

       while (i<4){ // sonucu? SONSUZ dongu

            if(i%3==0) // Bu sonsuz dongunun sebebi 0/3 =0 oldugunda, artis veya azalis islemi gerceklesmiyor
                continue;// Bir dongude kendinden sonra gelen kod blogunu veya statement ARTAR, okumaz
            sum+=i;
            i++; // artis verilmaz
            System.out.println("i ="+i);
        }


    }
}

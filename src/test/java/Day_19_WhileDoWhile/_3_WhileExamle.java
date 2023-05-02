package Day_19_WhileDoWhile;

public class _3_WhileExamle {
    public static void main(String[] args) {
        char harf =65;// char degerini bir bir artirarak a herfini buluncaya kadar donguye karekterleri yazdirin

        //char i= 65;
        // kucuk a harfi 97 sayisina karsilik geliyor, bunu biliyorsak
       // while (harf<=97){
         //   System.out.println("Harf:" +harf);
          //  harf++;
        //}
        // Eger bilmiyorsak kacinci sayida oldugunu
        //while (harf<='a'){
          //  System.out.println("Harf = " +harf);
            harf++;
        //}

        for ( int i=1; i<=255; i++){ // burda 1 ile 255 arasi karekterleri yazdirdik

            char character = (char) i;// CAST yaptik, int olan sayiyi char a dondurduk
            System.out.println(i+"="+character);
        }


    }
}

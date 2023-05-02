package Day_23_MethodOverloading;

public class _1_intro {
    public static void main(String[] args) {
        // Bir boolean methot yazın,en az iki tane int parametre alsın.
//        Bu parametre değişken değerlerinin ilk basamak degerleri
//        (yani 3465 sayısında ilk değer 3) aynı ise TRUE değilse FALSE döndürsün.
//        Sonrasında main de bu TRUE dönmesi durumunda degerleri toplasın.
//        Değil ise birler basamakları eşit ise çarpım yapsın. Değil ise bölme işlemi yapsın

        int num1=45435;
        int num2=2633;
        if (firstAndLastLastDigit(num1,num2))// Burada if icerinde boolen expression yani true yada false olmasi kontrol ediliyor
                                                // Bizim method boolean oldugu icin, return olan deger direkt if icerisinde yazilabilir
                                                // if (ilkdeger == sondeger) veya if(syi1==sayi2) gibi anisi
        {
            System.out.println(num1+num2);
        }else{
            System.out.println(num1/num2);
        }
    }

    public static boolean firstAndLastLastDigit(int sayi1, int sayi2 ){
        int firstDigit1=0;// Degisken blok disinda yazilmasi veya genel kullanima uygun yazilmasi daha kolay kullanim saglar
        int fistDigit2=0;

        //boolean flag;
        while (sayi1>=10){
            sayi1=sayi1/10;// Bu bolme islemi basamak azaltir
            firstDigit1=sayi1;
        }
        while (sayi2>=10){

            sayi2=sayi2/10;
            fistDigit2=sayi2;
        }
        if(firstDigit1==fistDigit2){
           // flag =true;
            return true;// Birden fazla return yazilabilir. Her condition saglanmasi durumunda return azilir
                        // onemli olan return TYPE
        }else {
          //  flag=false;
            return  false;
        }
       // return flag;
    }


}

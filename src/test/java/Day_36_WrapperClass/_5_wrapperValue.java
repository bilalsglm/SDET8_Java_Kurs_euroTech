package Day_36_WrapperClass;

public class _5_wrapperValue {
    public static void main(String[] args) {

        Integer a=5;
        //herhangi bir conver islemi olmadan yeniden deger atamasi yaptik
        a=7;//Burda yeniden atanan deger yine wrapper class objesi

        int b=6;

        //WRAPPER to Primitivie ---> UNBOXING
        a=b;//Burada ise Wrapper objesini primitive olan int degerine esitledik
        System.out.println("a = " + a);

        Double d1=Double.valueOf(25.4);//Wrapper cllasina ait deger
        double d2=d1;// Double wrapper class ina ait convert islemi
        System.out.println("d2 = " + d2);

        //Auto Boxing -->Primitive to wrapper
        int num=5;
        Integer num2=num;
        System.out.println("num2 = " + num2);

        int number1=new Integer(123);//unboxing
        Integer number2= new Integer(123);//no boxing
        int number3=number2;                // unboxing




    }
}

package Day_36_WrapperClass;

public class _2_WrapperClassMethod {
    public static void main(String[] args) {
        //bir class in icerisindeki method veya field lari kullanmak icinclass icerisine giris sifresi NOKTA

        int maxValue=Integer.SIZE;// Bunu bir deger atamaliiz.Cunku bir method calistirip deger verior
        System.out.println("maxValue = " + maxValue);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        double d=Double.MAX_VALUE;
        double d1=Double.MIN_VALUE;
        System.out.println("d = " + d);
        System.out.println("d1 = " + d1);

        byte b=Byte.MAX_VALUE;
        System.out.println("b = " + b);
        System.out.println(Byte.MIN_VALUE);

    }
}

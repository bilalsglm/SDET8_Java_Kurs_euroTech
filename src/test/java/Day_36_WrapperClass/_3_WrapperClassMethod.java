package Day_36_WrapperClass;

public class _3_WrapperClassMethod {
    public static void main(String[] args) {
        boolean c =Character.isAlphabetic('a');//Bu fonksiyon verilen deegrin alfabe iceriisnde yer alip
                                                        //almadigini boolean olarak doner.TRUE ve FALS

        System.out.println(c);
        System.out.println(Character.isAlphabetic('1'));

        //bir tex yazimindaki karakter olup olmadigini boolean olarak cevap return eder
        System.out.println(Character.isLetter('f'));
        System.out.println(Character.isLetter('2'));
        System.out.println(Character.isLetter('&'));

        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isDigit('d'));

    }
}

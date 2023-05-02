package Day_16_TernaryOperators;

public class _3_ternaryOperator {
    public static void main(String[] args) {

        int number = 17;
        String result;
        //klasik Yontem
        if(number>0){
            result = "sayi Pozitiftir.";
            System.out.println(result);
        }else {
            result ="sayi nagatiftir.";
            System.out.println(result);
        }

        // Ternary operator
        result = (number>0) ? "sayi pozitiftir" : "sayi negatiftir.";
        System.out.println("result = " + result);

        // En kisa yazdirma

        System.out.println(result=(number>0) ?"sayi pozitiftir" : "sayi negatiftir.");
        // ? ---> if yerine kullaniliyor,  : ---> Else yerine kullaniliyor

    }
}

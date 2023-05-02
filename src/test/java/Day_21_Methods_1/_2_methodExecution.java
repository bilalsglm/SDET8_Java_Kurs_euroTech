package Day_21_Methods_1;

public class _2_methodExecution {

    public static void mesajiYaz(){// Bir method tanimladik

        System.out.println("Method icerisindeyim"+"\n");
    }

    public static void main(String[] args) {
        System.out.println("Methoddan onceki kodlar"+"\n");

        mesajiYaz();// Method un nerede oldugu degil, MAIN icerisnde hangi sirada yazdiginiz onemli.
                    // sirasi geldiginde Method icerisindeki tum kodu calistirir, sonra alt satiri gecer

        System.out.println("Method dan sonraki kodlar");

    }
}

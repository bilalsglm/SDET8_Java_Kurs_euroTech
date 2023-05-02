package Day_12_ifStatement;

public class _3_ifExercccises {
    public static void main(String[] args) {
        // 18 yas ve uzeri olanlar oy kullanabilir kosulu yazin

        int yas;
        yas=23;
        //if(yas>=18)
        if(yas>18 || yas==18)
            System.out.println("Oy kullanabilirsiniz");// if kosulu sanrasi tek satir yazilacaksa susulu paranteze gerek yok
                                            // suslu parantez olmaaadan birden fazla satir yazarsaniz; sadece ilkini okur
    }
}

package Day_13_ifElseIf;

public class _2_ifElseIfExsample {
    public static void main(String[] args) {

        // Not dagilimi;

        // Alinan scor 100-80 arasi ---> A
        // Alinan scor 80-70 arasi ---> B
        // Alinan scor 70-60 arasi ---> C
        // Alinan scor 60-40 arasi ---> D
        // Alinan scor 40 dan dddaha dusukse ---> F

        int scor=45;

        if(scor >80){
            System.out.println("Ogrencinin aldigi puan A dir.");
            if(scor>90){
                System.out.println("Ogrenci A++ notu gak etti");
            }
        }
        if(scor>60){
            System.out.println("Ogrenci C ve uzeri puan almayi hak etti");
            if(scor>70){
                System.out.println("Ogrenci B puanini hak etti");
            }
        }else {
            System.out.println("Orenci sinifta kaldi... Uzgunuz...");
        }
    }
}

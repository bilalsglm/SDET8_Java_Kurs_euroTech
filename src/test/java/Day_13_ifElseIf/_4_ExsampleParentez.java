package Day_13_ifElseIf;

public class _4_ExsampleParentez {
    public static void main(String[] args) {
        int scor=45;

        // *****   Parantez     ********

        if(scor==20){
            scor+=scor;
            int toplam=scor++;
        }else if (scor>46)
        {//Eger else ile birlikte direkt if kullanilacaksa suslu parentez gerek yok
            System.out.println("*******");
        }
    }
}

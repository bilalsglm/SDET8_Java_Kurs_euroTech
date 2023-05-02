package Day_11_Java_Logical_Operators;

public class _4_LogicOperators {
    public static void main(String[] args) {
        int sayi = 40;
        System.out.println(sayi<= 30 || (sayi==41 && sayi>=45));
        System.out.println(sayi<= 30 || false);


        // islem onceli

        // Eger VE(&&) varsa oncelik onundur.operatorlerde de parantez ile belirtmedigimiz surece
        // DEFAULT olarak oncelikleri yapar. && operatoru || den once gelir



        /* VE durumu (&&)
        true  && true  --> true
        true  && false --> false
        false && true  --> false
        false && false --> false

         */

        /* VEYA durumu (||)

        true || true   ---> true
        true || false  ---> true
        false || true  ---> true
        false || false ---> false
         */


        // ! operatoru
        //DEGILI, olmayani gibi anlamlarinda kullanilan operator(!)

        int y;
        y=12;
        System.out.println((y<=20 && y>=4)); //TRUE
        System.out.println(!(y<=20 && y>=4)); //FALSE


    }
}

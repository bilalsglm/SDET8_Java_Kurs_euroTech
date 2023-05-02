package Day_45_Static_01;

public class DinnerTest {
    public static void main(String[] args) {

        Dinner mom= new Dinner("Ayse","SDET",25,"Expert");

       // Dinner.pizzaSlice;
       //int totalSlice= mom.pizzaSlice;// Bir degeri ifade ettigi icin int bir varible esitledim
       // System.out.println(mom.pizzaSlice);
        System.out.println("Toplam Pizza Dilimi = "+Dinner.pizzaSlice);// Better Than before

        Dinner dad=new Dinner("Ahmet","Teacher",30,"Math");
        Dinner kid=new Dinner("Jhon","Student",12,"None");


        mom.takeAslice();
        dad.takeAslice();
        kid.takeAslice();
        System.out.println("Toplam Pizza Dilimi method sonrasi= "+Dinner.pizzaSlice);

        kid.takeAslice(2);
        dad.takeAslice(1);
        System.out.println("Toplam Pizza Dilimi count method sonrasi= "+Dinner.pizzaSlice);




    }

}

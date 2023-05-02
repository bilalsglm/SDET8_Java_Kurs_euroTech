package Day_12_ifStatement;

public class _6_Exercises {
    public static void main(String[] args) {
        int yas = 23;
        double tax=1.2;
        boolean evetMi = true;
        String name   = "Bilal";
        char basHarf   = 'a';
        int sayac =0;
        ++sayac;
        sayac++;
        // || veya, && ve , >=, <= , ==

        sayac*=sayac;
         if (sayac==21){
             System.out.println("sayac = " + sayac);
         }

         int x=12;
         if (x==10|| (x>5 && x<100)) // Islem onceligi AND
             // ESIT MI
         {
             System.out.println("x = " + x);
        }// --> wrong

        if(x>=13)// >= veya <= logical operatorde hem essittir sonra gelir, hemde orada hic bir bosluk kabul etmez
        System.out.println("x = " + x);

        if(!(x==10)){ // Esit degilmi Tum parenteyin DEGILINI IFADE eder

        }
        if(x!=10){// x 10 a degil ise
            // Sadece x in tanimlanan degrini degilini ifade eder. esit degilmi der
            // x 10 a esit degil ise
        }


         // soru: 
    }
}

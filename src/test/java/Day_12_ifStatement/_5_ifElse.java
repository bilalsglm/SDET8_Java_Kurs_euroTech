package Day_12_ifStatement;

import javax.jws.soap.SOAPBinding;

public class _5_ifElse {
    public static void main(String[] args) {

        double balance=150;

        int score=5;
        double taxAvarage=0.20;
        int income=5000;

        // Kisinin gelir seviyesi NET olarak 3000 uzerinde ise kayit yaptirabilir

        // NET icin sadece gelirden vergiyi odeyin

        if((income-=income*taxAvarage)>=3000){
            System.out.println("Kayit yaptirabilir.");
        }else {
            System.out.println("Gelir artirilmalidir");
        }
        // Baska bir kosul durumunu ayni MAIN icerisinde test edebiliriz
        if (balance>=income){
            System.out.println("Yoksulluk seviyesinin uzerindedir");
        }else {
            System.out.println("Yoksuldur...");
        }

        // Basari durumu SCORE ile test etmek

        if(score==4){
            System.out.println("Basarili sailmaktadir.");
        }else {// Her ELSE kendinden onceki if kosulunun disindaki tum kosullari ifade eder

        }


        // DEGIL ise---> gelir dengesi 100 uzerinde olmama durumu
        if(!(balance*taxAvarage>10)){
            income=2000;
            int support=1200;

            income+= support;

            int totalIncome=income;

            System.out.println("totalIncome = " + totalIncome);

        }else {//balance*taxAvarage>100 ise yani denge gelir seviyesi 100 den buuuyuk ise

            System.out.println("Scor = "+score);

            score++;
            System.out.println("Yeterlidir, cunku scor degeri= "+ --score);

        }


    }
}

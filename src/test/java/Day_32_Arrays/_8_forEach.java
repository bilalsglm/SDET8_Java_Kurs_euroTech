package Day_32_Arrays;

public class _8_forEach {
    public static void main(String[] args) {
        String[] names ={"name1","name2","name3","name4","name5","name6"};

        double[] prices =new double[4];

        prices[0]=105;
        prices[1]=10.5;
        prices[2]=125.55;
        prices[3]=15.99;

//        Normal bildigimiz for ile
        for (int i = 0; i < names.length; i++) {
            System.out.println("names = " + names[i]);
        }

        //Foreach ile yazdirilma islemi
        for (String s: names) {
            System.out.println("s ="+s);
        }
        // s sizin tanimladiginiz yeni degisken
        // Srting data type ve names--> sizin dizinizin ismi

        // double olan prices dizisini foreach ile yazdirma islemi
        for (double pr: prices) {
            System.out.println("pr ="+pr*2);
        }

        // Verilen fiyatlari %20 iskonto uygulaiyniz

        for (double db:prices) {
            System.out.println("db*0.20 :"+(db-db*0.20));

        }




    }
}

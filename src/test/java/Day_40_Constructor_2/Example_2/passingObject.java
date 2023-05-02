package Day_40_Constructor_2.Example_2;

public class passingObject {
    public static void main(String[] args) {

        SDET ramazanBey=new SDET("Ramazan Bey",35,'M',"Boing",12000);
        SDET guldenHanim=new SDET("Gulden Hanim",30,'F',"Airbus",13000);

        System.out.println("guldenHanim = " + guldenHanim.salary);
        
        vergiKesimi(guldenHanim);
        System.out.println("guldenHanim vergi kesildi = " + guldenHanim.salary);

        System.out.println("ramazanBey = " + ramazanBey.salary);

        vergiKesimi(ramazanBey);//Obje ve initilaze edilmis halde kabul ediyor

        System.out.println("ramazanBey vergi kesildi = " + ramazanBey.salary);



        SDET bilalBey;//initilaze edilmemis bir obje
        //vergiKesimi(bilalBey);// Bu sekilde kabul etmez
        
    }


    public static void vergiKesimi(SDET personal){
        personal.salary-=2000;

    }
}

package Day_40_Constructor_2.Example_1;

public class Student {
    int ogrNumber;
    String ogrName;
    String ogrSurname;
    int ogrLavel;
    boolean aktfMi;

    public Student(){
        System.out.println("Nesne olusturuldu");
    }



    public Student (int ogrNumber,String ogrName,String ogrSurname,int ogrLavel,boolean aktfMi){

        this.ogrNumber=ogrNumber;
        this.ogrName=ogrName;
        this.ogrSurname=ogrSurname;
        this.ogrLavel=ogrLavel;
        this.aktfMi=aktfMi;

    }



    public Student (int ogrNumber,String ogrName,String ogrSurname,int ogrLavel){

//        this.ogrNumber=ogrNumber;
//        this.ogrName=ogrName;
//        this.ogrSurname=ogrSurname;
//        this.ogrLavel=ogrLavel;
//        this.aktfMi=false;

        this(ogrNumber,ogrName,ogrSurname,ogrLavel,false);

    }
    public Student (int ogrNumber,String ogrName,String ogrSurname){

//        this.ogrNumber=ogrNumber;
//        this.ogrName=ogrName;
//        this.ogrSurname=ogrSurname;
//        this.ogrLavel=0;
//        this.aktfMi=false;
        this(ogrNumber,ogrName,ogrSurname,0,false);

    }
    public Student (int ogrNumber,String ogrName){

        this(ogrNumber,ogrName,"",0,false);

    }
    public Student (int ogrNumber){

        this(ogrNumber,"","",0,false);

    }

    // this() --> bu sytex ile Constructor methodunu cagirabiliyoruz.
    //This tekrarlarini ortadan kaldirir
    //Tek bir this() ile parantez icine tum parametreleri girerek ve olmayan parametrelerin DEFAULT degerini atiyoruz


    //Birinci yontem ile Ogrenci ozellikleriyle create etme
    public static Student createStudent(){

        //ArrayList<Student> ogrListesi=new ArrayList<>();
        Student ogr1=new Student();
//      Student ogr2=new Student();

        ogr1.aktfMi=true;
        ogr1.ogrLavel=3;
        ogr1.ogrName="Ahmet";
        ogr1.ogrSurname="Bayrak";
        ogr1.ogrNumber=100345;
        return ogr1;
    }
}

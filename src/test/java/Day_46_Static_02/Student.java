package Day_46_Static_02;

public class Student {

    String name;
    int age;
    int idNummer;
    static String school="euroTech";

    public Student() {
    }

    public Student(String name, int age, int idNummer) {
        this.name = name;
        this.age = age;
        this.idNummer = idNummer;
    }
    public void m2(){
        //static String ac=""; LOCAL variable STATIC
        school="";
        age=1;
        name="";
    }
    public static void m1(){
      //  static int a=4;//Static olarak LOCAL variable OLAMAZ!!!
//        m2();
//        age=2;
//        name="";
        school="";

        Student s1=new Student("Jhon",12,123);
        System.out.println("s1.age = " + s1.age);
        System.out.println("s1.name = " + s1.name);

        //onceden creat edilen bir objeye farkli degerler atadik
        s1=new Student("ismail",25,321);
    }

    @Override
    public String toString(){
        return "Student =[name= "+name+", age= "+age+", idNummer= "+idNummer+", school= "+school+"]";
    }


}

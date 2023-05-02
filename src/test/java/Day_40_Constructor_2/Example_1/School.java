package Day_40_Constructor_2.Example_1;

public class School {
    public static void main(String[] args) {
        //ikinci bir yontem ile ogrenci create ettik.
        Student ogr3=Student.createStudent();
        System.out.println("Method cagiirlirak ogrenci kaydi  "+ogr3.ogrNumber);

        Student ogr4=new Student();
        ogr4.ogrName="Bilal";
        System.out.println("Consturctor ile ogrenci kayd  "+ogr4.ogrName);

        //ucuncu bir yontem ile ogrenci create ettik
        Student ogr5 =new Student(123,"Ahmet","Bayram",5,true);
        System.out.println("Parametreli olan constuctor cagirdik:"+ogr5.ogrName);

        //Bazi parametreler belli degil ise nasil kaydetme yapacagiz-1
        Student ogr6 =new Student(123,"Ahmet","Bayram",6);
        System.out.println("Parametreli olan constuctor cagirdik:"+ogr6.ogrName);

        //Bazi parametreler belli degil ise nasil kaydetme yapacagiz-2
        Student ogr7 =new Student(123,"Ahmet","Bayram");
        System.out.println("Parametreli olan constuctor cagirdik:"+ogr7.ogrName);

        //Bazi parametreler belli degil ise nasil kaydetme yapacagiz-3
        Student ogr8 =new Student(123);
        System.out.println("Parametreli olan constuctor cagirdik:"+ogr8.ogrName);

    }






}

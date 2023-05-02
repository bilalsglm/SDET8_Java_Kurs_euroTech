package Day_39_ConstructorAndOOP.Constructor;

public class Okul {
    public static void main(String[] args) {

        //yontem 1 -->Direkt constructor parametreli tanimlanarak OBJE create ettik
        Student ogr = new Student(1234223, "hasan", "karayel", 5);

        System.out.println(ogr);// Direkt yazdirilamiyor.Bir method ihtiyaci var

        //yontem 2 -->En classic obje olusturma methodu
        Student st = new Student();

        st.name="ismet";
        st.surname="gns";
        st.id=21433;
        st.classRoom=3;

        createStudent(5476,"ahmet","dogan",6);//Method ile bir student objesi create ettik

    }

    //ontem 3 -->Method yardimi ile instance variable tanimladik
    public static Student createStudent(int id, String name, String surname, int classRoom) {
        Student student = new Student();

        student.classRoom = classRoom;
        student.id = id;
        student.surname = surname;
        student.name = name;


        return student;
    }

}

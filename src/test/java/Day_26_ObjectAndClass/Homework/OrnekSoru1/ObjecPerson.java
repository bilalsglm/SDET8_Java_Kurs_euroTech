package Day_26_ObjectAndClass.Homework.OrnekSoru1;

public class ObjecPerson {
    public static void main(String[] args) {

        Person person = new Person();
        Person person1= new Person();

        person.name="Ali";
        person.surname="Tas";
        person.age=40;
        person.id=123451;

        person1.name="Veli";
        person1.surname="Kas";
        person1.age=30;
        person1.id=654321;


        person.getBirthYear();
        person1.getBirthYear();
        System.out.println("*************");
        person.getVerifyId();
        person1.getVerifyId();
        System.out.println("***************");
        person.kisiBilgileri();
        System.out.println("****************");
        person1.kisiBilgileri();


    }
}

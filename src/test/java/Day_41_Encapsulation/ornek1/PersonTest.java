package Day_41_Encapsulation.ornek1;


public class PersonTest {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.setName("Albert");
        p1.setAge(25);
        p1.setGender('F');
        System.out.println("p1 = " + p1);



        Person p2=new Person();
        
        p2.setName("345654554");
        p2.setAge(-25);
        p2.setGender('M');
        System.out.println("p2 = " + p2);


    }
}

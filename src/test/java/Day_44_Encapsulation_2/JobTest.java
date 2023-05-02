package Day_44_Encapsulation_2;

public class JobTest {

   public static void main(String[] args) {

      //  name(); Bir method cagirdik.

      //Bir obje create ettik
      Job employee =new Job();

      System.out.println("employee = " + employee);

      String name="Bilal";
      System.out.println(name+"´in job title si = "+employee.getSalary());


      Job employee1=new Job("SDET","euroTech",1500);

      System.out.println("Set olmadan employee1 = " + employee1);


   }
}


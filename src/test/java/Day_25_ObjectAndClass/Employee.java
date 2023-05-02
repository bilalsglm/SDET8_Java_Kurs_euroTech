package Day_25_ObjectAndClass;
public class Employee {
    String name;
    String jonTitle;
    double salary;
    int workHours;
    public void wor(){
        // Nesne olusturmak icin MAIN zorunlu degildir
        Employee employee = new Employee();
        // instance variable direckt olarak kullandik--> Vlau= default = null
        System.out.println(name+ " is work very hard...");
    }
    public void interoduce(){

        System.out.println(" Employee`s name: "+name + "\n Job Title : "+jonTitle+"\n Salar : "
                            +salary+"\n Work Hours : " +workHours);
    }
}
class objectEmployee{
    public static void main(String[] args) {
        Employee employee = new Employee(); // Burada bir nesne olustruduk

        employee.interoduce();
        System.out.println();

        // Degiskenlere deger atadim
        employee.workHours=8;
        employee.name="Ayse";
        employee.salary=5630.345;
        employee.jonTitle="Senior Qa";

        // Method cagirdim
        employee.interoduce();
    }

}
package Day_48_inheritance_02.ornek_2;

import java.io.FilterOutputStream;

public class Employee extends Person {

    String jobTitle;
    public void work(){
        System.out.println(name+" is working as "+jobTitle);
        // Bilal bey QA olarak calismaktadir.
    }

    @Override
    public String toString() {
        return "Employee [jobTitle= " + jobTitle + ", name=" + name+ ", age=" + age + ", gender=" + gender + ']';
    }
}

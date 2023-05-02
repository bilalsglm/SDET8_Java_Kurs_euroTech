package Day_48_inheritance_02;

public class SubClass extends SuperClass {
    SubClass(){
        //super(2);//Super constructor
        super(2);
        System.out.println("This is subClass");
    }
    public static void display(){
        System.out.println("Sub Class method calsiti");
    }
}

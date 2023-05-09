package Day_56_Polymorphism_2;

import java.util.ArrayList;
import java.util.List;

public class ShapeArray {
    public static void main(String[] args) {
        Shape [] shape=new Shape[3];//Bir sekil objelerinin icerecek array olusturdum
        shape[0]=new Cricle();//sekil dizisini ilk elementine Daire objesi creat ettim
        shape[1]=new Triangle();
        shape[2]=new Square();

        shape[0].draw();//Burada Sekil dizisinin ilk elementinin (Yani daire objesinin)
                       //draw methodunu cagirdik
        shape[1].draw();
        shape[2].draw();

        System.out.println("**************************");

        for (Shape sh:shape) {//foreach ile diziyi yazdirmak istedik
//            System.out.println(sh.getClass());//class information getirir (OBJECT class indan)
//            System.out.println(sh.getClass().getName());
            System.out.println(sh.getClass().getSimpleName());
        }
        System.out.println("*******************************");

        //List ile Arraylist arasindaki Polymorphism var
        List<Shape> shapeList=new ArrayList<>();//Bu List adinda Interface clasinin
                                                //Child classlarindan Arraylist kullandik

        shapeList.add(new Cricle());//Burada bir Daire Objesi olusturup ekledim
        shapeList.add(new Triangle());
        shapeList.add(new Square());

        for (int i = 0; i < shape.length; i++) {
            System.out.println(shapeList.get(i).getClass().getSimpleName());
        }

    }
}

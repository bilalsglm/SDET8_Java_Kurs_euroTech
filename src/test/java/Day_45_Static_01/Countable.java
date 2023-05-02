package Day_45_Static_01;

public class Countable {

//    int instanceCount;// instance varible
    int instanceCount;// class varible
    static int instanceCount2;//CLASS variable

    Countable(){
        instanceCount2++;
        instanceCount++;
    }
    public int getInstanceCount(){
        return instanceCount2;
    }

    public int getInstanceCount1(){
        return instanceCount;
    }
}

package Day_45_Static_01;

public class Dinner {

    String name;
    String title;
    int age;
    String job;

    public Dinner(String name, String title, int age, String job) {
        this.name = name;
        this.title = title;
        this.age = age;
        this.job = job;
    }

    static int pizzaSlice=8;
    public void takeAslice(){
        pizzaSlice--;
    }
    public void takeAslice(int count){
        pizzaSlice-=count;
    }
}

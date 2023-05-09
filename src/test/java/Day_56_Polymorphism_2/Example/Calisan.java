package Day_56_Polymorphism_2.Example;

public class Calisan extends Kisi{

    private String departman;

    public Calisan(String name, String soyadi, String gorevi , String departman) {
        super(name, soyadi, gorevi);
        this.departman=departman;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}

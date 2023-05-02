package Day_44_Encapsulation_2;

public class Employee {
    private String name;
    private int idNummer;
    private String departmant;
    private String position;

    public Employee(String name, int idNummer, String departmant, String position) {

        this.setName(name);
        this.setIdNummer(idNummer);
        this.setDepartmant(departmant);
        this.setPosition(position);

    }
    public Employee(String name, int idNummer, String departmant) {
        this(name,idNummer,departmant,"");
    }

    public Employee(String name, int idNummer) {
        this(name,idNummer,"","");
    }

    public Employee(String name) {
        this(name,0,"","");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNummer() {
        return idNummer;
    }

    public void setIdNummer(int idNummer) {

        this.idNummer = idNummer;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee={" +
                "name='" + name + '\'' +
                ", idNummer=" + idNummer +
                ", departmant='" + departmant + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

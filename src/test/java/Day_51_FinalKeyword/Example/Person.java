package Day_51_FinalKeyword.Example;

public class Person {
    private final String name;
    private final int tcNo;

    public Person(String name, int tcNo) {
        this.name = name;
        this.tcNo = tcNo;
    }

    public String getName() {
        return name;
    }

    public int getTcNo() {
        return tcNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}

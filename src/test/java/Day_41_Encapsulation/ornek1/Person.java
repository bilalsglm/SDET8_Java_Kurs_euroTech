package Day_41_Encapsulation.ornek1;

public class Person {

    private String name;
    private int age;
    private char gender;

//    public void setName(String name) {
//        char[]crr =new char[name.length()];
//        String [] str =name.split("");


    public void setName(String name) {
        String str =name.toLowerCase();
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='a'&&str.charAt(i)<'z');
            newStr+=str.charAt(i);

        }

        if (newStr.length()==name.length())
            this.name = name;

}
    // Biz this dedigimiz yas degerini mutlak degerli bir sekildetanimladik
    public void setAge(int age) {
        this.age = Math.abs(age);
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

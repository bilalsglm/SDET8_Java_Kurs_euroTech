package Day_51_FinalKeyword;

public class _1_introduction {

    public static int toplam(int a,int b){
        return a+b;
    }


    public static int toplam(int a){
        return a;
    }

    public static int toplam(int a,int b,int c){
        return a+b+c;
    }
    public static int toplam(){
        int a=5, b=7;
        return a+b;
    }

    public static void main(String[] args) {
        toplam();
        toplam(3);
        toplam(4,5);
        toplam(3,4,6);
    }
    int age;
    String name;


    public void eat(){
        System.out.println("canlilar birseyler yiyerek yasarlar");
    }

    public static void superTest(){
        System.out.println("super clas icerisinde");
    }
    // Overriding --> ayni isimli methodun statement kismini degistirme islemi
    // Overriding inheritance icerisinde super class dan alinir

//    @Override
//    public void eat(){
//        System.out.println("Kediler sut icer");
//    }
}

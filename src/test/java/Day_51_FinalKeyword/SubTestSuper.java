package Day_51_FinalKeyword;

public class SubTestSuper {

    public static void main(String[] args) {

        Sub obje=new Sub();
        System.out.println(obje.num);
        obje.artis();
        System.out.println(obje.num);
        Super s=new Super();
        System.out.println(s.num);
        s.artis();
        System.out.println(s.num);
    }
}

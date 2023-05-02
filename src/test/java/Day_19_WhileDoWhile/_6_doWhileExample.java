package Day_19_WhileDoWhile;

public class _6_doWhileExample {
    public static void main(String[] args) {
        int i=0;
        int m=6;

        do { // While satirina kadar olan statement kismini sarta bakmaksizin
            m*=2; // m=m*2
            System.out.println("m :" +m);
            i++;

        }while (i<=5);
    }
}

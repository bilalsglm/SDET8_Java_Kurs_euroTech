package Day_16_TernaryOperators;

public class _5_TernaryExample2 {
    public static void main(String[] args) {

        int score=45;
        String aldigiNot;

        if(score >=90){
            aldigiNot=" Notunuz A ";
            System.out.println("aldigiNot = " + aldigiNot);
        } else if (score >= 80) {// 80 ile 89 arasi bir puan
            aldigiNot = "Notunuz B";
            System.out.println("aldigiNot = " + aldigiNot);
        } else if (score >= 70) {
            aldigiNot = "Notunuz C";
            System.out.println("aldigiNot = " + aldigiNot);
        } else if (score >= 60) {
            aldigiNot = "Notunuz D";
            System.out.println("aldigiNot = " + aldigiNot);
        } else if (score >= 50) {
            aldigiNot = "Notunuz E";
            System.out.println("aldigiNot = " + aldigiNot);
        }else {
            aldigiNot=" Notunuz F; Dersten kaldiniz.";
            System.out.println("aldigiNot = " + aldigiNot);
        }
        // Ternary Operator
        aldigiNot=score>=90 ? " Notunuz A" :
                            score>=80 ? " NOtunuz B" :
                                    score >= 70 ? "Notunuz C" :
                                            score >= 60 ? "Notunuz D" :
                                                    score >= 50 ? "Notunuz E":
                                                            " Notunuz F; Dersten kaldiniz.";
        System.out.println("aldigiNot = " + aldigiNot);

    }
}

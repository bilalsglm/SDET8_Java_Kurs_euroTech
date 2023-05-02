package Day_22_Methods_2;

public class _5_payCalculator {
    public static void main(String[] args) {

        payCalculator(6.5,15.5);
        payCalculator(9,14);
    }

    public static void payCalculator(double hours, double hourlyPay){

        double totalIncome = hours*hourlyPay;
        double taxRange=0.47;
        double netIncome=totalIncome-totalIncome*taxRange;



        System.out.println(netIncome);
    }
}

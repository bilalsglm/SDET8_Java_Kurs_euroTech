package Day_14_SwitchCase;

public class _3_ExsampleSwitchCase {
    public static void main(String[] args) {
        int month = 1;
        String monthName;
        String monthSeason;

        switch (month){
            case 1:monthName="Ocak";break;
            case 2:monthName="Suabt";break;
            case 3:monthName="Mart";break;
            case 4:monthName="Nisan";break;
            case 5:monthName="Mayis";break;
            case 6:monthName="Haziran";break;
            case 7:monthName="Temmuz";break;
            case 8:monthName="Agustos";break;
            case 9:monthName="Eylul";break;
            case 10:monthName="Ekim";break;
            case 11:monthName="Kasim";break;
            case 12:monthName="Aralik";break;
            default:monthName="Uygun bir ay ismi degil";
        }
        switch (month){
            case 12:
            case 1:
            case 2:
                monthSeason ="Kis";break;
            case 3:
            case 4:
            case 5:
                monthSeason ="Ilkbahar";break;
            case 6:
            case 7:
            case 8:
                monthSeason ="Yaz";break;
            case 9:
            case 10:
            case 11:
                monthSeason ="Sonbahar";break;
            default:monthSeason="Uygun bir mevsim ismi degil";
        }
        if(month>=0 && month <=12) {
            System.out.println(monthName + " ayi " + monthSeason + " Mevsimindedir.");
        }else {
            System.out.println("bu sayida bir ay mevcud degildir");
        }
    }
}

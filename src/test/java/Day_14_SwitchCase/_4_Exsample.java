package Day_14_SwitchCase;

public class _4_Exsample {
    public static void main(String[] args) {

        // bugun gunlerden persembedir 100 gun sonra hangi gundur

        int hesGunSayisi=100;
        int kalangunSayisi=hesGunSayisi%7;
        String yeniGun= " ";

        switch (kalangunSayisi)
        {
            case 1:yeniGun="Cuma";break;
            case 2:yeniGun="Cumartesi";break;
            case 3:yeniGun="Pazar";break;
            case 4:yeniGun="Pazartesi";break;
            case 5:yeniGun="Sali";break;
            case 6:yeniGun="Carsamba";break;
            case 0:yeniGun="Persembe";break;
        }
        System.out.println(hesGunSayisi+" gun sonra, gunlerden "+yeniGun+"\'dir");


    }
}

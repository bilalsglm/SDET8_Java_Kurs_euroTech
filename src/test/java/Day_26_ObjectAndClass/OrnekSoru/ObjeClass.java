package Day_26_ObjectAndClass.OrnekSoru;

public class ObjeClass {
    public static void main(String[] args) {

        ElektirikHesabi elektirikHesabi = new ElektirikHesabi();
        Musteri musteri =new Musteri();
        ElektirikHesabi elektirikHesabi1 = new ElektirikHesabi();
        Musteri musteri1 = new Musteri();

        elektirikHesabi.oran=0.7;
        elektirikHesabi1.oran =0.67;

        int yeniOran= (int) (elektirikHesabi.oran+elektirikHesabi1.oran);

        musteri.name="Mr. Selim";
        musteri1.name="Mr. Bilal";

    }

}

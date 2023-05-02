package Day_46_Static_02;

public class stBlock {
    private String city;

    static String country;
// Tum statement lerden once calisir.Main den once kosulur
    //Class icerisinde hicbir access modifry almadan yazilir

    static {
        System.out.println("static block-1 calisti");
        country="USA";
    }

    stBlock(String a){
        this.city=a;
        System.out.println("Constructor calisti");
    }
    public String getCity(){
        return city;
    }
    static {
        System.out.println("static block-2 calisti");
        country="UK";
    }


}

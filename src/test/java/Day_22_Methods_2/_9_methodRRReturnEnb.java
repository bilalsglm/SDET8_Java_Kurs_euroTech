package Day_22_Methods_2;

public class _9_methodRRReturnEnb {
    public static void main(String[] args) {
        enBuyukSayi(45,55);// Bu method un bir sonuc degeri var, bu mehod kostuktan sonra bir deger donduruyor
        //int result=enBuyukSayi(45,85);
        //System.out.println(result);
        System.out.println(enBuyukSayi(45,85));
        //result= enBuyuk(12,34); Bu method bir donus degeri olmadigi icin DEFAULT degeri gibi dusunun,yok
        //System.out.println(enBuyuk(12,34);); Method bir variable degil. PRINTLN--> varibale yazdirirrr

    }

    public static int enBuyukSayi(int sayi1,int sayi2){
        int enb;
        if(sayi1>sayi2){
            enb=sayi1;
        }else {

            if(sayi1==sayi2){
                enb=0;
            }else
            {
                enb=sayi2;
            }

        }
        return enb;
    }
//  bir Return degeri olmayan bir method tanimladik
    public static void enBuyuk(int x,int y){
        int enb;
        if(x==y){
            enb=0;
            System.out.println("enb = " + enb);
        }else

        {
            if(x>y){
                enb=x;
                System.out.println("enb = " + enb);
            }else {
                enb=y;
                System.out.println("enb = " + enb);
            }
        }
    }

}

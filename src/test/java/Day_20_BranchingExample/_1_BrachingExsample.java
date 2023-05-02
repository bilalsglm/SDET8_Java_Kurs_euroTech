package Day_20_BranchingExample;

public class _1_BrachingExsample {
    public static void main(String[] args) {

        int sum =0, number=0;

        boolean kontrol=true;

        while (kontrol){

            number++;// Numaranin onemi yok.20 denmesinin burada sadece dongu icin verilmisbi deger
                    // o yuzden toplam dongude artarak devam etsin . onemli olan toplam yeni SUM

            if(sum<100){ // SAET TOPLAMDA SAKLI
                        // Toplami if sarti sagladiktan sonra yapiyoruz
                sum+=number;// Burada SUM yuzden kucuk oldugu surece burada toplama yapacak

                // break; Cok daha kolay veya sade kod yazimi ile birlikte statement yaziminda zaman tasarrufu saglar

            }
            else {
                number--;
                kontrol=false;// Toplam 100 veya uzeri bir rakam ise dongu dursun

            }


        }
        System.out.println("The number is  " + number);
        System.out.println("The sumc is " + sum);

        // BREAK --> Daha efektif kod icin ve kolay cozumler iicn gerekli
        //

    }
}

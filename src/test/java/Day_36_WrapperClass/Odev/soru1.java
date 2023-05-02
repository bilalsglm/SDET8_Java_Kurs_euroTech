package Day_36_WrapperClass.Odev;

public class soru1 {
    public static void main(String[] args) {
        //Sıra sayısına göre (0'dan başlayarak) her diziden bir karakter seçerek
        // aşağıdaki ifadedeki gizli anahtarı bulan bir yöntem yazın.
        //findSecretKey("Bazen", "kederler", "sessiz",  "degisiklik", "yapmk",
        //"kismetsizliginde", "ıslanmak", "istemezsler");

        String anahtarKelime =findSecretKey("Bazen","kederler","sessiz","degisiklik","yapmk","kismetsizliginde",
                "ıslanmak","istemezsler");
        System.out.println("Sampiyon " + anahtarKelime);
    }
    static public String findSecretKey (String... str){

        String keyWord ="";
        for (int i = 0; i < str.length; i++) {
            //keyWord+=str[i].charAt(i);
            keyWord=keyWord+str[i].charAt(i);

        }
        return keyWord;
        }


    }

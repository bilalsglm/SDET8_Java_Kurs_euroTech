package Day_37_ArrayList.Odev;

public class soru1 {
    public static void main(String[] args) {

        String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
        //-Yukarıda verilen stringlerin alfabede yer alan karakteri bir string e atayan method yazınız.
       // -Ardından bu yenı oluşturulan string deki rakamları bir ArrayList e atayıp yazdırınız.
         // -Farklı algoritma ve methodlar denenebilir.

        String yeni1="";
        for (int i = 0; i < str1.length() ; i++) {
            if(Character.isAlphabetic(str1.charAt(i)) || str1.charAt(i)== ' '){
                yeni1=yeni1+str1.charAt(i);
            }
        }
        String yeni2="";
        for (int i = 0; i < str2.length() ; i++) {
            if(Character.isAlphabetic(str2.charAt(i)) || str2.charAt(i)== ' '){
                yeni2=yeni2+str2.charAt(i);
            }
        }




        System.out.println(yeni1);
        System.out.println(yeni2);

    }

}

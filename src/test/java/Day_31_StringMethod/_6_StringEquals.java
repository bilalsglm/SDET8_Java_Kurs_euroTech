package Day_31_StringMethod;

public class _6_StringEquals {
    public static void main(String[] args) {
        String name ="Ahmet";
        String name1="Ahmet";
        String name2 = new String("Ahmet");
        boolean b =name2.equals(name1);// Bir boolean dddegeridir. TRUE veya FALSE doner
        boolean b1=name1==name;// bu da boolean exprrression

        if(name==name1){
            System.out.println("name1 ile name esitir = "+name1);
        }

    }
}

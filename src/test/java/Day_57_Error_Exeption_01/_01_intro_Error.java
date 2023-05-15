package Day_57_Error_Exeption_01;

public class _01_intro_Error {
    public static void main(String[] args) {
        System.out.println("Program calisti");
        String str="";
        str.charAt(3);
        str.substring(0,1);

        //StringIndexOutOfBoundsException Hata verecek

        System.out.println("Hatadan sonra");
    }
}

// Derleme zamanindaki hatalar: Compile Error
// Programin calisma zamanindaki hatalar : Runtime Error , Exeption

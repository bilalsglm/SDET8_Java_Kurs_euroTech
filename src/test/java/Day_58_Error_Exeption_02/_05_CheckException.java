package Day_58_Error_Exeption_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _05_CheckException {

    public static void main(String[] args) {



        try {
            FileInputStream file= new FileInputStream("liste.txt");
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}

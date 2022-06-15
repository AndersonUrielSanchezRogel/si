package programax;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ler {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public String texto() {
        String texto=null;
        try{
            texto=bf.readLine();
        }catch(IOException ioe){
            System.out.println("Error de IO");
            System.exit(0);
        }
        return texto;
    }
}

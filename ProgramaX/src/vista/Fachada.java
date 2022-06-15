package programax;

import java.util.Scanner;

public class Fachada {

    public void fachada() {
        String marca;
        String modelo;
        int año;
        Scanner entrada = new Scanner(System.in);
        Ler ler = new Ler();

        System.out.println("Ingresar la marca");
        marca=ler.texto();
        System.out.println("Ingresar modelo");
        modelo=ler.texto();
        System.out.println("Ingresar ano");
        año=entrada.nextInt();
        
        
        System.out.println(marca+" "+modelo+" "+año);
    }

}

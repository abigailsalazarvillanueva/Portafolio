package mx.utng.sesion4;

import java.util.Scanner;

public class Lector {
    private Scanner scanner;
    
    public Lector(){
        scanner = new Scanner(System.in);
    }
    
    public void muestraMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public String leerEntrada(){
        return scanner.nextLine();
    }

    public void muestraMensaje(String mensaje,String dato){
        System.out.printf("\t Este es el texto: %s %s \n\n\n", mensaje, dato);
    }
}
//Josué Alejandro Esparza Padilla
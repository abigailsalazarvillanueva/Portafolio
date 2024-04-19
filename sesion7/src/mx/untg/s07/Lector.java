package mx.untg.s07;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leerOpcion(){
        System.out.println("Opcion: ");
        return scanner.nextByte();
    }
}
//Josué Alejandro Esparza Padilla
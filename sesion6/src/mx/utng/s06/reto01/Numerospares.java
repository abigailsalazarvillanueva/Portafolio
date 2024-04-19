package mx.utng.s06.reto01;

import java.util.Scanner;

public class Numerospares {
    public static void main(String[] args) {
        //Utilizando el modulo poner todos los numeros
        //pares que hay en un rango dado por el usuario
        //inicio, fin, i
        //ciclo for o while o do while, if
        Scanner inicior = new Scanner(System.in);
        Scanner finalr = new Scanner(System.in);
        System.out.println("Dame el inicio del rango");
        int ini = inicior.nextInt();
        System.out.println("Dame el final del rango");
        int fin = finalr.nextInt();
        finalr.close();
        inicior.close();
        for (int i = ini; i <=fin ; i++) {
            if (i%2 ==0)
            System.out.println(i);
        }//Josué Alejandro Esparza Padilla
    }
}

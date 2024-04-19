package mx.utng.s05;

public class primitivos {

    public static void main(String[] args) {
        // Entero muy pequeño (-128 a 127)
        byte valorByte = 111;
        System.out.println(valorByte);

        //Entero corto (-32768 a 32767)
        short valorShort = 32767;

        //Entero base (-2147483648 a 2147483647 )
        int valorInt = 2147483647;

        //Entero más largo (-9223372036854775808 a 9223372036854775807)
        long valorLong = 9223372036854775807l;

        //Numero real tienen punto decimal es de 6 cifras despues del punto
        float valorFloat = 7.123456789f;
        System.out.println("Flotante: "+valorFloat);

        //Numero real con doble precision es de 16 cifras depsues del punto
        double valorDouble = 3.1234567890123456789012;
        System.out.println("Double: "+valorDouble);

        //Valor booleano con solo dos valores posibles true/false
        boolean valorBoolean = true;

        //Primitivo para texto
        char valorChar = 'K';
        System.out.printf("Valor booleano: %b %n Valor char %c%n", valorBoolean,valorChar);

        float numFloat = 101.5f;
        int numInt1 = (int)numFloat;
        System.out.printf("Flotante: %1.2f, Entero: %d %n",numFloat,numInt1);

        char numChar = 'M';
        numChar++;
        int numInt2 = numChar;
        System.out.printf("Char: %c, Entero: %d %n",numChar,numInt2);
    }
}
//Josué Alejandro Esparza Padilla
package mx.utng.s05.reto01;

public class RetoPrimitivos {
    public static void main(String[] args) {
        //Todos los tipos de datos primitivos e imprimir su valor minimo y valor maximo
        //Utilizando en una sola instruccion la funcion printf
        //byte,short,int,long,char,boolean,float,double)
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte:");
        System.out.printf("Minimo: %d, Maximo: %d %n",minByte,maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("\n Short:");
        System.out.printf("Minimo: %d, Maximo: %d %n",minShort,maxShort);

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("\n int:");
        System.out.printf("Minimo: %d, Maximo: %d %n",minInt,maxInt);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("\n Long:");
        System.out.printf("Minimo: %d, Maximo: %d %n",minLong,maxLong);

        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        System.out.println("\n Char:");
        System.out.printf("Minimo: %c, Maximo: %c %n",minChar,maxChar);

        boolean minBoolean = Boolean.TRUE;
        boolean maxBoolean = Boolean.FALSE;
        System.out.println("\n Boolean:");
        System.out.printf("Minimo: %b, Maximo: %b %n",minBoolean,maxBoolean);

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("\n Float:");
        System.out.printf("Minimo: %f, Maximo: %f %n",minFloat,maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        Double.toString(minDouble);
        Double.toString(maxDouble);
        System.out.println("\n Double:");
        System.out.printf("Minimo: %s, Maximo: %s %n",minDouble,maxDouble);
    }
}
//Josué Alejandro Esparza Padilla
package mx.utng.s28;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ejercicio1Tests {
    @Test
    @DisplayName("Suma dos cadensa convertidas a enteros")
    Void addUptwoIntegers(){
        String a = "4";
        String b = "8";

        Integer expected = 12;

        Ejercicio1 ejercicio1 = new Ejercicio1();

        assertEquals(expected, ejercicio1.sumar(a, b));
        return null;
    }

    
}

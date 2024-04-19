package mx.utng.s30;

import java.util.ArrayList;
import java.util.List;

public class FacturaTest {
    public static void main(String[] args) {
        Factura f1 = new Factura ("Computadora", 10000);
        Factura f2 = new Factura ("Telefono", 5000);
        Factura f3 = new Factura ("Impresora", 4000);
        Factura f4 = new Factura ("TV", 8000);

        List<Factura> facturas = new ArrayList<Factura>();
        facturas.add(f1);
        facturas.add(f2);
        facturas.add(f3);
        facturas.add(f4);

        Factura fo = null;
        for (Factura factura : facturas) {
            if (factura.getImporte()==5000) {
                fo = factura;
                break;
            }
        }
        System.out.println(fo.getConcepto()+", "+fo.getImporte());


       long x = facturas.stream().filter(s->s.getImporte()> 4000).count();

        System.out.println(x);
    }
   
    
}

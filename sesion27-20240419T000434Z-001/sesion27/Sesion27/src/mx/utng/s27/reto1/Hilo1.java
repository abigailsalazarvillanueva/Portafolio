package mx.utng.s27.reto1;

//Guadalupe Abigail Salazar Villanueva
//GDS0624

import java.util.concurrent.TimeUnit;

public class Hilo1 extends Thread{ 
    @Override
    public void run(){
        for (int i = 0; i <=10; i++) {
            System.out.println("Hilo1: "+i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        

    }
    
}

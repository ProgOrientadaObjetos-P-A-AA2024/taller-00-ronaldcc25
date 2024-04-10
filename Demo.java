
package paquete2;

import paquete3.Informacion;
import paquete4.Palabra;

public class Demo {


    public static void main(String[] args) {
        String cadena = Palabra.obtenerPalabra();
        int num = Informacion.obtenerHabitantes();
        
        System.out.printf("%s, una ciudad llena de arte y naturaleza con %d", cadena ,num);
        // usar printf;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje;
// Para usar lo que contiene el paquete uno se tiene que importar como tal el 
// paquete 1 y la clase donde tienes el valor que necesitas en el main principal
import paquete3.Informacion;
// Se realiza lo mismo para todos los valores que se desea usar en el main 
// principal
/**
 *
 * @author reroes
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String cadena = Mensaje.obtenerMensaje();
        int valor = Informacion.obtenerHabitantes();
        
        System.out.printf("%s %d\n", cadena, valor);
        // usar printf;
    }

}
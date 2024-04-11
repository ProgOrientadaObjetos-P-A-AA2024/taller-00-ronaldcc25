package paquete2;
import java.util.Scanner;
import paquete1.Mensaje;
// Para usar lo que contiene el paquete uno se tiene que importar como tal el 
// paquete 1 y la clase donde tienes el valor que necesitas en el main principal
import paquete3.Informacion;
// Se realiza lo mismo para todos los valores que se desea usar en el main 
// principal
// 1 a 5 cadena original
public class Demo002 {
    
    public static Scanner leer = new Scanner (System.in); 
    
    public static void main(String[] args) {
        
        System.out.print("Ingrese la opcion del 1 al 5 si desea mostrar la "
                + "cadena original: ");
        int opcion = leer.nextInt();
        String cadena = Mensaje.obtenerMensaje();
        int valor = Informacion.obtenerHabitantes();  
        
        if(opcion >= 1 && opcion <= 5){
                
        System.out.printf("%s %d\n", cadena, valor);
        }else{
        String result = cadena.toUpperCase();
            System.out.printf("%s %d\n", result, valor);
        }
        // usar printf;
    }

}

package proyecto1;

import javax.swing.JOptionPane;

public class Programa4 {
    
    public static void main(String[] args) {
    // leer datos de input de imprimirlos por consola
    
    // Ejercicio : solicitar por panel el nombre y la edad
    //             de una persona y luego imprimir los datos
    //             por consola.
    
    String nombre = JOptionPane.showInputDialog("Ingrese Nombre");
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nombre"));
    
    //imprimos datos por consola
    System.out.println("Nombre ingresado: " + nombre);
    System.out.println("Edad ingresada: " + edad);
    }
}

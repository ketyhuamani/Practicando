package proyecto1;
import javax.swing.*;

public class Programa5 {
    public static void main(String[] args) {
    //hallar e imprimir por consola y por panel
    //el area de un cuadrado 
        
    // paso 1: declaracion de variables
       double lado, area;
    // paso 2: solicitar por panel y leer lado
       String slado = JOptionPane.showInputDialog("Ingrese lado");
    // paso 3: convertir slado a double
       lado= Double.parseDouble(slado);
    // paso 4: calcular el area
       area=lado*lado;
    // paso 5: imprimir area por consola
       System.out.println("El area es : "+area);
    // paso 6: imprimir area por panel
       JOptionPane.showMessageDialog(null, "El area es : "+area);
    }
}

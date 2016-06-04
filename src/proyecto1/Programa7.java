package proyecto1;
import javax.swing.*;

public class Programa7 {
 public static void main(String[] args) {
 //programa que solicita por panel 2 numeros enteros
 //e imprime por pnael el mayor de ellos.
 
 //variables 
 int n1, n2;
 // solicito y leo datos
 String sn1 = JOptionPane.showInputDialog("Ingrese Numero Entero 1:");
 String sn2 = JOptionPane.showInputDialog("Ingrese Numero Entero 2:");
 //convertimos sn1 y sn2 a int:
 n1 =Integer.parseInt(sn1);
 n2 =Integer.parseInt(sn2);
 //averiguar si n1 es igual a n2
 if(n1==n2){
     JOptionPane.showMessageDialog(null, "no hay mayor, son iguales");
     return;
  }
 if(n1>n2)
     JOptionPane.showMessageDialog(null, "El mayor es: "+n1);
 else
     JOptionPane.showMessageDialog(null, "El mayor es: "+n2);
 

       
       
       
   }    
}

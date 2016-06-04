package proyecto1;
import javax.swing.*;

public class Programa8 {
 public static void main(String[] args) {
 //programa que solicita por panel 3 numeros enteros
 //e imprime por panel el menor de ellos
 
//variables 
 int n1, n2, n3;
 // solicito y leo datos
 String sn1 = JOptionPane.showInputDialog("Ingrese Numero Entero 1:");
 String sn2 = JOptionPane.showInputDialog("Ingrese Numero Entero 2:");
 String sn3 = JOptionPane.showInputDialog("Ingrese Numero Entero 3:");
 //convertimos sn1, sn2 y sn3 a int:
 n1 =Integer.parseInt(sn1);
 n2 =Integer.parseInt(sn2);
 n3 =Integer.parseInt(sn3);
 //averiguar si n1 es igual a n2
 if(n1==n2 && n1==n3 ){
     JOptionPane.showMessageDialog(null, "no hay menor, son iguales");
     return;
  }
/* if(n1<n2 && n1<n3)
     JOptionPane.showMessageDialog(null, "El menor es: "+n1);
 else {
     if(n2<n3)
     JOptionPane.showMessageDialog(null, "El menor es: "+n2);
     else
     JOptionPane.showMessageDialog(null, "El menor es: "+n3);    
 }
   */
//hallando el menor
int menor =n1;
if(n2<menor)
    menor=n2;
if(n3<menor)
    menor=n3;
// imprimir por panel el menor
JOptionPane.showMessageDialog(null, "El menor es: "+menor);
 }    
}

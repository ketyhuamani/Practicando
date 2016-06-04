package proyecto1;
import javax.swing.*;

public class Programa9 {
 public static void main(String[] args) {
 // solicitar por panel 4 notas de un alumno, validar cada
 // nota y luego si son validas las 4, Hallar e imprimir el promedio de notas
 // eliminando la menor nota
 // Adicionalmente imprimiran por panel el mensaje APROBADO
 // el promedio es >= 14, caso contrario  : DESAPROBADO
 
//variables 
 int n1, n2, n3, n4, promedio;
 // solicito y leo datos
 String sn1 = JOptionPane.showInputDialog("Ingrese Nota 1:");
 String sn2 = JOptionPane.showInputDialog("Ingrese Nota 2:");
 String sn3 = JOptionPane.showInputDialog("Ingrese Nota 3:"); 
 String sn4 = JOptionPane.showInputDialog("Ingrese Nota 4:"); 
  n1 =Integer.parseInt(sn1);
  n2 =Integer.parseInt(sn2);
  n3 =Integer.parseInt(sn3);
  n4 =Integer.parseInt(sn4);
 
 if(n1<0 || n1>20){
     JOptionPane.showMessageDialog(null, "nota 1 invalida");
     return;
  }
if(n2<0 || n2>20){
     JOptionPane.showMessageDialog(null, "nota 2 invalida");
     return;
  }
if(n3<0 || n3>20){
     JOptionPane.showMessageDialog(null, "nota 3 invalida");
     return;
  }
if(n4<0 || n4>20){
     JOptionPane.showMessageDialog(null, "nota 4 invalida");
     return;
  }

//hallando el menor
int menor =n1;
if(n2<menor)
    menor=n2;
if(n3<menor)
    menor=n3;
if(n4<menor)
    menor=n4;
//calculamos promedio

promedio=(n1+n2+n3+n4-menor)/3;
// imprimir por panel el menor
JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
  if(promedio>=14)
JOptionPane.showMessageDialog(null, "APROBADO");      
   else
JOptionPane.showMessageDialog(null, "DESAPROBADO");      
 }    
}

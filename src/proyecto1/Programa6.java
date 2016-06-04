package proyecto1;

import javax.swing.*;

public class Programa6 {
   public static void main(String[] args) {
   // programa que halla e imprime por consola y por panel
   // el area de un triangulo
   double base, altura, area;
   String sbase=JOptionPane.showInputDialog("Ingrese base");
   String saltura= JOptionPane.showInputDialog("Ingrese altura");
   
   base=Double.parseDouble(sbase);
   altura=Double.parseDouble(saltura);
   
   area=base*altura/2;
   
   System.out.println("El area es :" + area);
   
   JOptionPane.showMessageDialog(null, "El area es :" + area);
   
}  
}

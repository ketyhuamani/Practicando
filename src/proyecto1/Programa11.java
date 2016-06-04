package proyecto1;
import javax.swing.*;

public class Programa11 {
  public static void main(String[] args) {
  
  //solicitar por panel un numero entero de 3 cifras, validarlo
  //e imprimir por panel dicho numero, es o no capicua.
  // Ejem: 121. 454, 595
  
  //variables
  int num, centena, decena, unidad, suma;
  //solicitar y leer numero
  String snum = JOptionPane.showInputDialog("Ingrese Entero de 3 cifras");
  num =Integer.parseInt(snum);
  // validar si es de 3 cifras
  if(num<100 || num>999){
   JOptionPane.showMessageDialog(null, "Numero debe ser de 3 digitos");
  return;
  }
  //descomponer numero en sus 3 digitos
  centena=num/100;
  decena=(num%100)/10;
  unidad=num%10;
  //sumar digitos
  
  if(centena == unidad){
    
    JOptionPane.showMessageDialog(null, "El numero es Capicua");
  }
  else{
   
    JOptionPane.showMessageDialog(null, "El numero no es Capicua");  
  } 
  }  
}

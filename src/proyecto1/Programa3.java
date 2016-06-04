
package proyecto1;

public class Programa3 {
    
    public static void main(String[] args) {
    
    //un operado es el simbolo que representa una
    //operacin entreg variable y/o numeros, y tambien
    //entre condiciones lógicas.
    
    /*operadores de Java
        a) operadores aritmeticos: + - * /
           % = operador modulo (residuo de una division)    
    */
    
    int x=7, y=4;
    int z=x%y;
    System.out.println("Valor de z:" +z);
    
    /* b) operadores de comparación:
        > <  >=  <=
        igual:  ==
        diferente o distinto : !=    
    */
    
    /* c)operadores lógicos
        AND = && (amperson)
        OR = || (alt 124)
    */
    
    // operadores de incremente y decremento
    int k = 2;
    k++;
    System.out.println("Valor de k:" +k);
    k--;
    System.out.println("Valor de k:" +k);
    k+=3;
    System.out.println("Valor de k:" +k);
    k-=4;
    System.out.println("Valor de k:" +k);
    k*=6;
    System.out.println("Valor de k:" +k);
    k/=3;
    System.out.println("Valor de k:" +k);
    }
    
}

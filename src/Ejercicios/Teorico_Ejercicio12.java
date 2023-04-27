/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
*/

public class Teorico_Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese dos numeros:");
        int num1= lector.nextInt();
        int num2= lector.nextInt();
        
       String resultado=esMultiplo(num1,num2);
       
       System.out.println(resultado);
    }
    
    
    public static String esMultiplo(int num1, int num2){
        
        //son multiplos??
        boolean esMultiplo = num1 % num2 == 0;
        
        if(esMultiplo){
            return "es multiplo!";
        } else {
            return "NO es multiplo. A tu casa.";
        }
    }
}

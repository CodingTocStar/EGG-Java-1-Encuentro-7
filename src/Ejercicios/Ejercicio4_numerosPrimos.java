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
public class Ejercicio4_numerosPrimos {

    /*
    Crea una aplicación que nos pida un número por teclado y con una
    función se lo pasamos por parámetro para que nos indique si es o no un
    número primo, debe devolver true si es primo, sino false.

    */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese numero para saber si es primo");
        
        int num = lector.nextInt();
        
        boolean resultado = esPrimo(num);
        
        System.out.println(resultado);
    }
    
    public static boolean esPrimo(int num){
        int contador=0;
        for(int i=1 ; i<=num ; i++){
             if(num % i == 0){
                 contador++;
             }
        }
        
        while (contador==2){
            return true;
        } return false;
    }
    
}

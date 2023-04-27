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
public class Ejercicio1_CalculadoraBasica {

    /*
    Crea una aplicación que le pida dos números al usuario y este pueda
    elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
    una función para cada operación matemática y deben devolver sus
    resultados para imprimirlos en el main.
    */
    public static void main(String[] args) {
        //escaneo
        Scanner lector = new Scanner(System.in);
        
        //pido numeros
        System.out.println("Ingrese 2 numeros para operar");
        int num1 = lector.nextInt();
        int num2 = lector.nextInt();
        
        //interfaz grafica
        
        menu(lector, num1, num2);
        
        
    }
    
    public static void menu(Scanner lector, int num1, int num2){
        int operacion;
        do{
            System.out.println("QUe operacion desea realizar?");
            operacion = lector.nextInt();
            
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-MUltiplicacion");
            System.out.println("4-Division");
            System.out.println("5-Salir");

            switch (operacion){
                case 1:
                    System.out.println("El resultado de la suma es: " + suma(num1,num2));;
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es: " + multiplicacion(num1, num2));
                    break;
                case 4:
                    System.out.println("El resultado de la division es: " + division(num1, num2));
                    break;
                case 5:
                    System.out.println("Besitos besitos chau chau");
                    break;
                default:
                    System.out.println("Operacion no valida");
                    break;
            }
        } while(operacion!=5);
    }
    
    public static int suma(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
    
    public static int resta(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }
    
    public static int multiplicacion(int num1,int num2){
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }
    
    public static float division(float num1, float num2){
        float division = num1 / num2;
        return division;
    }
}

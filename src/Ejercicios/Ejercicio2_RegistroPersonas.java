/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/*
 Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
*/
import java.util.Scanner;

public class Ejercicio2_RegistroPersonas {
    public static void main(String[] args) {
        solicitarDatosPersonas();
    }

    public static void solicitarDatosPersonas() {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        while (true) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la edad de la persona: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Para capturar el salto de línea que queda en el buffer

            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }

            System.out.print("¿Desea ingresar otra persona? (Ingrese 'No' para detener): ");
            respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("No")) {
                break;
            }
        }

        scanner.close();
    }
}
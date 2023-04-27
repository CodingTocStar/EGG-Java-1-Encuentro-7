/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

    import java.util.Scanner;
/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
*/
public class Ejercicio3_ConversorDivisas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en euros: ");
        double euros = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese la moneda a la que desea convertir (dolares, yenes, libras): ");
        String moneda = scanner.nextLine();

        convertirDivisa(euros, moneda);

        scanner.close();
    }

    public static void convertirDivisa(double euros, String moneda) {
        double conversion = 0;
        String monedaSimbolo = "";

        if (moneda.equalsIgnoreCase("dolares")) {
            conversion = euros * 1.28611;
            monedaSimbolo = "$";
        } else if (moneda.equalsIgnoreCase("yenes")) {
            conversion = euros * 129.852;
            monedaSimbolo = "¥";
        } else if (moneda.equalsIgnoreCase("libras")) {
            conversion = euros * 0.86;
            monedaSimbolo = "£";
        } else {
            System.out.println("Moneda no válida. Por favor, ingrese dolares, yenes o libras.");
            return;
        }

        System.out.println(euros + " euros equivalen a " + conversion + " " + monedaSimbolo);
    }
}
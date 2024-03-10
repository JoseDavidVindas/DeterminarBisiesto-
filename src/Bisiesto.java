/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Jose
 */



import java.util.Scanner;

/**
 * Clase que determina si un año dado es bisiesto o no.
 */

public class Bisiesto {
    
    /**
     * Método principal que solicita al usuario ingresar un año y determina si es bisiesto o no.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        // Se verifica si el año es bisiesto o no y se muestra el resultado.
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
} 

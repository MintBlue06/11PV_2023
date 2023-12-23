package main.ar.edu.unju.fi.e9;

import java.util.Scanner;

/**
 * @author Alvarez Carlos Matias
 * @since 19/12/23
 * 
 * Se solicita un año, y se comprueba si es bisiesto
 */
public class Principal {
    public static short año;
    public static void main(String[] args) {
        /**
         * El objeto 'principal' se va a comunicar
         *  con cada metodo y procedimiento
         */
        Principal principal = new Principal(); //creamos un nuevo objeto 'principal'
        principal.introducirAño();
        principal.comprobarAño(año);
    }
    public void introducirAño() {
        Scanner scanner = new Scanner(System.in); //creamos un ojeto 'scanner' para introducir año
        System.out.println("Ingresar año");
        año = scanner.nextShort();
        scanner.close(); //cerramos el scanner
    }
    /** 
     * Comprueba si el año es bisiesto 
     */
    public void comprobarAño(short año) {
        /**
         * Si el 'año' es divisible por 4 y por 100, o es divisible por 400
         * El 'año' es bisiesto
         */
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}

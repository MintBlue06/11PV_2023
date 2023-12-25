package main.ar.edu.unju.fi.e10;

import java.util.Scanner;
/**
 * @author Alvarez Carlos Matias
 * @since 24/12/23
 * 
 * Ingresar por consola un numero entre 1 y 9, 
 *  posteriormente se mostrara su tabla de multiplicar 
 * desde el 0 hasta el 9
 */
public class Principal {
    public static byte multiplicador = 0;
    public static byte numero;
    public static void main(String[] args) {
        /**
         * El objeto 'principal' se va a comunicar
         *  con cada metodo y procedimiento
         */
        Principal principal = new Principal(); //creamos un nuevo objeto 'principal'
        principal.introducirNumero();
        principal.multiplicarNumero(numero, multiplicador);
    }
    /**
     * 'introducirNumero' pide el numero al que se mostrara su tabla de multiplicar
     */
    public void introducirNumero() {
        Scanner scanner = new Scanner(System.in); //crea un ojeto 'scanner'
        System.out.println("Ingresar numero");
        numero = scanner.nextByte(); //introduce el numero
        scanner.close(); //cierra el scanner
    }
    public void multiplicarNumero(byte numero, byte multiplicador) {
        /**
         * Mientras el 'numero' sea menor o igual a 9 y mayor o igual a 1
         *  se ejecutara la estructura
         */
        while (numero <= 9 && numero >=1) { 
            /**
             * Mientras el 'multiplicador' sea menor o igual a 9
             *  se ejecutara la estructura
             */
            while (multiplicador <= 9) { 
                /**
                 * 'producto' es el resultado de la multiplicacion
                 */
                int producto = numero * multiplicador; 
                System.out.println(numero + " * " + multiplicador + " = " + producto);
                multiplicador++; //al 'multiplicador' se le suma 1
            }
        System.out.println("Tabla de multiplicar finalizada");
        numero = 10; //el 'numero' elegido se vuelve 10 para finalizar la estructura 
        }
    }
}
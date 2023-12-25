package main.ar.edu.unju.fi.e11;

import java.util.Scanner;

/**
 * @author Alvarez Carlos Matias
 * @since 25/12/23
 * 
 * Ingresar un numero entero y verificar 
 *  si corresponde con un mes del año (1 al 12).
 * En caso contrario imprimir un mensaje de error
 */
public class Principal {
    public static short numero;
    public static void main(String[] args) {
        
    }
    /**
     * 'ingresarNumero' pide el numero a comprobar
     */
    public void ingresarNumero() {
        Scanner scanner = new Scanner(System.in); //crea un ojeto 'scanner'
        System.out.println("Ingresar numero");
        numero = scanner.nextShort(); //introduce el numero
        scanner.close(); //cierra el scanner
    }
    /**
     * @param numero deberia corresponder con un mes del año y
     *  segun el caso se va a nombrar el mes. Ej: 1 = "Enero".
     * En caso contrario aparece un mensaje de error por 'default'
     */
    //FIXME El 'numero' te lo deberia volver a pedir la maquina
    //Falta terminar! podria haber una funcion comprobarMes() tambien
    public void comprobarNumero(short numero) {
        if (condition) {
            
        }
        switch (numero) {
            case 1:
                System.out.println("Mes " + numero + ": Enero");
                break;
        
            default:
                break;
        }
    }

}

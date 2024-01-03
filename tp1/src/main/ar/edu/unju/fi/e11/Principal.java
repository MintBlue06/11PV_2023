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
    public static Scanner scanner = new Scanner(System.in); //crea un ojeto 'scanner'
    public static void main(String[] args) {
        //short numero;
        /**
         * El objeto 'principal' se va a comunicar
         *  con cada metodo y procedimiento
         */
        Principal principal = new Principal(); //creamos un nuevo objeto 'principal'
        principal.ingresarNumero();
        principal.comprobarNumero(numero);
    }
    /**
     * 'ingresarNumero' pide el numero a comprobar
     */
    public void ingresarNumero() {
        Scanner scanner = new Scanner(System.in); //crea un ojeto 'scanner'
        System.out.println("Ingresar numero");
        numero = scanner.nextShort(); //introduce el 'numero'
        //scanner.close(); //cierra el 'scanner'
    }
    /**
     * @param 'numero' debe corresponder con un mes del año y
     *  segun el caso se va a nombrar el mes. Ej: 1 = "Enero".
     * En caso contrario aparece un mensaje de error por 'default'
     */
    //FIXME El 'numero' te lo deberia volver a pedir la maquina
    //Falta terminar! podria haber una funcion comprobarMes() tambien
    public void comprobarNumero(short numero) {
        //ingresarNumero();
        String mes = ""; //se va a usar para establecer el mes en el mensaje
        do {
            switch (numero) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                System.out.println("No existe ese mes");
                break;
            }
            /**
            * El mensaje aparece solo si el 'numero' esta entre 1 y 12
            */
            if (numero >= 1 && numero <= 12) {
                System.out.println("Mes " + numero + ": " + mes);
            }
            
            //ingresarNumero();
            System.out.println("Ingresar numero");  
            numero = scanner.nextShort(); //introduce el 'numero'
            //scanner.close(); //cierra el 'scanner'
        } while (numero >= 1 && numero <= 12);   
    }
}

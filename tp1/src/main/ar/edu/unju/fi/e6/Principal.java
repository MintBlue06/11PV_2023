package main.ar.edu.unju.fi.e6;

import java.util.Scanner;

public class Principal {

    private static int numeroZ;
    public static void main(String[] args) {
        
        Principal principal = new Principal();
        //procedimiento1
        principal.ingresarNumero();
        //procedimiento2
        principal.multiplicarNumero( numeroZ);
    }
    public void ingresarNumero() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");

        numeroZ = scanner.nextInt();

        scanner.close();
    }
    public void multiplicarNumero(int numeroZ) {

        boolean par = (numeroZ % 2) == 0;

        if( par) {

            System.out.println("El numero " + numeroZ + " es par");

            numeroZ *= 3;

            System.out.println("Multiplicado por 3 da: " + numeroZ);
            
        } else {

            System.out.println("El numero " + numeroZ + " es impar");

            numeroZ *= 2;

            System.out.println("Multiplicado por 2 da: " + numeroZ);
        }
    }
}
/** La consola pide un numero, si es par lo multiplica por 3, sino lo multiplica por 2 */

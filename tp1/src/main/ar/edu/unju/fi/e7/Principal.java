package main.ar.edu.unju.fi.e7;
//*Se va a pedir un nro, luego va a calcular su factorial y a mostrarlo a continuacion*/
import java.util.Scanner;

public class Principal {

    private static int numero;

    private static int factorial = 1;
    public static void main(String[] args) {
        
        Principal principal = new Principal();

        principal.conseguirNumero();

        principal.factorialDelNumero( numero);

        System.out.println("Factorial de " + numero + ": "+ factorial);
    }
    public void conseguirNumero() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        numero = scanner.nextInt();

        scanner.close();
    }

    public int factorialDelNumero(int numero) {
        //si el numero es menor a cero, lo vamos a tratar con un Z+ (entero positivo)
        if (numero < 0) //{}

            numero *= -1;
            //System.out.println("El numero ingresado debe ser mayor o igual a 0");

        //si el numero es menor o igual a cero, devuelve 1
        if (numero <= 0) //{}
        
            return 1;
        
        while (numero > 1) {
        //mientras el numero sea mayor a 1, se va a multiplicar el factorial por el numero
            factorial *= numero;
            //y luego se va a reducir el numero en 1 unidad
            numero--;
        }
        return factorial;
    }
}

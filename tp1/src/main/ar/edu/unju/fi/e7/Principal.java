package main.ar.edu.unju.fi.e7;
//Falta terminar
import java.util.Scanner;

public class Principal {

    private static int numero;

    private static int factorial;
    public static void main(String[] args) {
        
        Principal principal = new Principal();

        principal.conseguirNumero();

        principal.factorialDelNumero( numero);

        /*for (int i = 0; i < 10; i++) {
            
            System.out.printf("Factorial de %d: . Iterativo: %d", i, factorial);
            System.out.println(".()");
        }*/
        System.out.println("Factorial de " + numero + ": "+ factorial);
    }
    public void conseguirNumero() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        numero = scanner.nextInt();

        scanner.close();
    }

    public int factorialDelNumero(int numero) {

        //if (numero <= 0) {

           
        //}

        //return 1;

        if (numero <= 0) {

            if (numero < 0) {}

            numero *= -1;
            //return 1;

       } else {

        return 1;
        //numero *= -1;
        }

        
        //numero *= -1;
        
        factorial = 1;
        while (numero > 1) {
            
            factorial *= numero;

            numero--;

        }
        return factorial;

    }
}

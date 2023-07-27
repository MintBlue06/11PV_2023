package main.ar.edu.unju.fi.e4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Scanner es el objeto que va a identificar el numero
        Scanner scanner = new Scanner( System.in);

        System.out.println("Nota 1: ");
        //Primer numero
        float nota1 = scanner.nextFloat();

        System.out.println("Nota 2: ");
        //Segundo numero
        float nota2 = scanner.nextFloat();

        System.out.println("Nota 3: ");
        //Tercer numero
        float nota3 = scanner.nextFloat();

        System.out.println("Nota 4: ");
        //Cuarto y ultimo numero
        float nota4 = scanner.nextFloat();
        //Scanner cerrado, si no se cierra en el codigo aparece un error
        scanner.close();
        
        double resultadoPromedio = (nota1 + nota2 + nota3 + nota4) / 4;
        //Promedio obtenido
        System.out.println("Resultado del Promedio = " + resultadoPromedio);
        
    }
}

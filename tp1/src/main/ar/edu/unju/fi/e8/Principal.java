package main.ar.edu.unju.fi.e8;

import java.util.Scanner;
/**
 * @author Alvarez Carlos Matias
 * @since 19/12/23
 * 
 * Se solicita nombre y edad, posteriormente
 *  se verifica si es mayor o menor de edad
 */
public class Principal {
    private static String nombre;
    private static byte edad;
    public static void main(String[] args) {

        Principal principal = new Principal();
        principal.conseguirDatos();
        principal.mensaje(nombre, edad);
        principal.verificarSiEsMayorDeEdad(edad);
    }

    public void conseguirDatos() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar nombre");

        nombre = scanner.nextLine();

        System.out.println("Ingresar edad");

        edad = scanner.nextByte();

        scanner.close();
    }
    public void mensaje(String nombre, byte edad) {
        System.out.println("El usuario " + nombre + " con edad " + edad + "");
    }
    public void verificarSiEsMayorDeEdad(byte edad) {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}

package main.ar.edu.unju.fi.e8;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
    }

    public void conseguirDatos() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar nombre");

        String nombre = scanner.nextLine();

        System.out.println("Ingresar edad");

        byte edad = scanner.nextByte();

        scanner.close();
    }

    public void verificarSiEsMayorDeEdad() {}
}

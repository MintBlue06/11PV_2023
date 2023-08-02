package main.ar.edu.unju.fi.e5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in);

        System.out.println("Radio de un circulo: ");
        //Radio conseguido
        byte radio = scanner.nextByte();

        scanner.close();

        double area = (radio * radio) * Math.PI;
        //Area calculada
        System.out.println("Area del circulo: " + area);

    }

}

/**El usuario elije un numero de radio de un circulo y se calcula su area */

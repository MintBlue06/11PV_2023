package main.ar.edu.unju.fi.e5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        /*Scanner scanner = new Scanner( System.in);

        System.out.println("Radio de un circulo: ");

        byte radio = scanner.nextByte();

        scanner.close();*/

        double area = area(radio);

        System.out.println("Area del circulo: " + area);

    }

    public static double area(byte radio) {

        Scanner scanner = new Scanner( System.in);

        System.out.println("Radio de un circulo: ");

        radio = scanner.nextByte();

        scanner.close();

        //final double Math,PI = 3.1415926535;

        double area = (radio * radio) * Math.PI;

        return area;
    }
}

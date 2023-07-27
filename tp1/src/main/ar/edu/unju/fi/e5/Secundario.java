package main.ar.edu.unju.fi.e5;

import java.util.Scanner;

public class Secundario {
    
    public static void main(String[] args, double area) {
        /*Scanner scanner = new Scanner( System.in);

        System.out.println("Radio de un circulo: ");

        byte radio = scanner.nextByte();

        scanner.close();

        double area = (radio * radio) * Math.PI;*/

        Secundario secundario = new Secundario();

        //double area;

        secundario.calcularArea();
        //double areaCalculada = area;
        
        System.out.println("Area del circulo: " + area);
    }

    public double calcularArea() {

        Scanner scanner = new Scanner( System.in);

        System.out.println("Radio de un circulo: ");

        byte radio = scanner.nextByte();

        scanner.close();

        double area = (radio * radio) * Math.PI;

        return area;
        
    }

}

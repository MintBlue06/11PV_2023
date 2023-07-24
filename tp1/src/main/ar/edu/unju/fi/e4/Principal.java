package main.ar.edu.unju.fi.e4;

public class Principal {
    public static void main(String[] args) {

        double resultado = dividir(5 , 2);

        System.out.println("Resultado = " + resultado);
        
    }

    public static double dividir(float numero1, float numero2) {

        double resultado = numero1 / numero2;
        
        return resultado;
    }
}

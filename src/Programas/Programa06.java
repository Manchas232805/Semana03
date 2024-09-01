package Programas;
import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args) {
        //Declarar variables
        Scanner scanner = new Scanner(System.in);
        int numero;

        //Entrada de datos
        System.out.print("Ingresa un número entero: ");
        numero = scanner.nextInt();

        //Proceso y salida de datos
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
    }
}
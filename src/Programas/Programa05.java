package Programas;
import java.util.Scanner;

public class Programa05 {
    public static void main(String[] args) {
        //Declarar variables
        Scanner lectura = new Scanner(System.in);
        String nombre;

        // Entrada de datos
        System.out.print("Ingresa un nombre: ");
        nombre = lectura.nextLine();

        // Proceso y salida de datos
        if (nombre.length() <= 5) {
            System.out.println("El nombre es corto");
        } else {
            System.out.println("El nombre es largo");
        }
    }
}

package Programas;
import java.util.Scanner;

public class Programa04 {
    public static void main (String[] args){
        //Declarar variables
        Scanner lectura = new Scanner(System.in);
        String mensaje;
        int numero;
        //Entrada de datos
        System.out.print("Ingresa un número entero: ");
        numero = lectura.nextInt();
        //Proceso y salida de datos
        if (numero % 3 == 0) {
            System.out.println("El número es múltiplo de 3");
        }
    }
}

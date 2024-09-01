package Programas;
import java.util.Scanner;
public class Programa03 {
    public static void main (String[] args){
        //declarar variables
        int num;
        String mensaje;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un número");
        num = lectura.nextInt();
        //proceso de datos
        if(num > 0) {
            mensaje = "Número Positivo";
        }else if (num < 0) {
            mensaje = "Número Negativo";
        } else {
            mensaje = "Número es Neutro";
        }
        //salida de datos
        System.out.println(mensaje);
    }
}

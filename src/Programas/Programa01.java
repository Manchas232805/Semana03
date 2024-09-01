package Programas;
import java.util.Scanner;
public class Programa01 {
    public static void main (String[] args){
        //declarar variables
        int n1, n2, n3, n4 , mayor;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar primer número: ");
        n1 = lectura.nextInt();
        System.out.println("Ingresar segundo número: ");
        n2 = lectura.nextInt();
        System.out.println("Ingresar tercer número: ");
        n3 = lectura.nextInt();
        System.out.println("Ingresar cuarto número: ");
        n4 = lectura.nextInt();
        //proceso de datos
        mayor = n1;
        if(n2 > mayor) {
            mayor = n2;
        }
        if(n3 > mayor) {
            mayor = n3;
        }
        if(n4 > mayor) {
            mayor = n4;
        }
        //Salida de datos
        System.out.println("El número mayor es:" + mayor);
    }
}

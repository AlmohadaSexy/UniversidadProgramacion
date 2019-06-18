package Ejercicios1;
import java.util.Scanner;
public class Ejercicios1_4 {
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        //mensaje para el usuario
        System.out.print("Ingrese el LADO del cuadrado: ");
        double l = scanner.nextDouble();
        
        //hacemos las operaciones
        double a = l * l;
        
        //imprimimos las operaciones
        System.out.println("El área del cuadrado es igual a " + a);
    }
}
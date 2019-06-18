package Ejercicios1;
import java.util.Scanner;
public class Ejercicios1_1 {
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        //mensaje para el usuario
        System.out.print("Ingrese el PRIMER número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el SEGUNDO número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Ingrese el TERCER número: ");
        double numero3 = scanner.nextDouble();
        
        //hacemos las operaciones
        double suma = numero1 + numero2 + numero3;
        double multiplicacion = numero1 * numero2 * numero3;
        double media = suma / 3;
        
        //imprimimos las operaciones
        System.out.println("La suma es igual a " + suma);
        System.out.println("La multiplicación es igual a " + multiplicacion);
        System.out.println("La media es igual a " + media);
    }
}

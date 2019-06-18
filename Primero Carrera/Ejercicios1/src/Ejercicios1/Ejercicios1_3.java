package Ejercicios1;
import java.util.Scanner;
public class Ejercicios1_3 {
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        //mensaje para el usuario
        System.out.print("Ingrese el RADIO de la circunferencia: ");
        double r = scanner.nextDouble();
        
        //hacemos las operaciones
        double d = 2 * r;
        double p = 2 * 3.141592 * r;
        double r2 = Math.pow(r, 2);
        double a = 3.141592 * r2;
        
        
        //imprimimos las operaciones
        System.out.println("El diámetro de la circunferencia es igual a " + d);
        System.out.println("El perímetro de la circunferencia es igual a " + p);
        System.out.println("El área del círculo es igual a " + a);
    }
}

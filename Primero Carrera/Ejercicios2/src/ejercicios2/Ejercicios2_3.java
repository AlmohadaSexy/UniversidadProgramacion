package ejercicios2;
import java.util.Scanner;
public class Ejercicios2_3 {
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        
        //mensaje para el usuario
        System.out.print("Ingrese un n�mero cualquiera: ");
        
        //Leer n�mero
        int numero = scanner.nextInt();
        
        int resto = numero % 2;
        
        if (resto == 0) {
            System.out.println("El n�mero " + numero + " es par.");
        } else {
            System.out.println("El n�mero " + numero + " es impar.");
        }
    }
}

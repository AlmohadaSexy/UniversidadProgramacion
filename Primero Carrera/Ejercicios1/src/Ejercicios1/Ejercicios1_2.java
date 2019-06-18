package Ejercicios1;
import java.util.Scanner;
public class Ejercicios1_2 {
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CALCULADORA DE IMC");
        //mensaje para el usuario
        System.out.print("Ingrese su PESO: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese su ALTURA en metros: ");
        double numero2 = scanner.nextDouble();
        
        //hacemos las operaciones
        double imc = numero1 / (numero2 * numero2);
        
        //imprimimos las operaciones
        System.out.println("Tu IMC es igual a " + imc);
    }
}

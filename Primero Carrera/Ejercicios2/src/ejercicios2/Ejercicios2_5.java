package ejercicios2;
import java.util.Scanner;
public class Ejercicios2_5 {
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        //mensaje para el usuario
        System.out.print("Ingrese un número distinto de 5: ");
        int numero = scanner.nextInt();
        while (numero != 5){
            System.out.print("Ingrese un número distinto de 5: ");
            numero = scanner.nextInt();
            } 
                System.out.println("Ey, que el número tenía que ser distinto de 5.");
            }
        }
    

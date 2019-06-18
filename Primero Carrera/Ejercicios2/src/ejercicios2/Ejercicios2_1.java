package ejercicios2;
import java.util.Scanner;
public class Ejercicios2_1 {
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        
        //mensaje para el usuario
        System.out.print("Ingrese su edad: ");
        
        //leer edad
        int edad = scanner.nextInt();
        
        int diferencia = 18 - edad;
        
        if (edad >= 18) {
            System.out.println("Enhorabuena! Ya eres mayor de edad");
        } else {
            if (diferencia == 1){
                System.out.println("Lo siento, vas a tener que esperar " + diferencia + " año para ser mayor de edad...");
            } else {
                System.out.println("Lo siento, vas a tener que esperar " + diferencia + " años para ser mayor de edad...");
            }
        }
    }
}

package ejercicios2;
import java.util.Scanner;
public class Ejercicios2_2 {
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
        if ( imc <= 18.5){
            System.out.println("Su IMC es bajo.");
        } else{
            if ( 18.5 < imc && imc < 25){
                System.out.println("Su IMC es normal.");
            } else {
                if( 25<= imc && imc < 30) {
                    System.out.println("Usted sufre de sobrepeso.");
                } else{
                    System.out.println("Usted está obeso, debería pensarse lo de adelgazar.");
                }
            }
        }
    }
}

package ejercicios2;
import java.util.Scanner;
public class Ejercicios2_4 {
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        
        //mensaje para el usuario
        System.out.println("Elige una de mis 5 bebidas favoritas: ");
        System.out.print("Coca-Cola=1, Cerveza=2, Fanta=3, Sprite=4, Aquarius=5: ");
        
        int numero = scanner.nextInt();
        String bebida = "";
        switch( numero ){
            case 1:
                bebida = "Coca-Cola";
                break;
            case 2:
                bebida = "Cerveza";
                break;
            case 3:
                bebida = "Fanta";
                break;
            case 4:
                bebida = "Sprite";
                break;
            case 5:
                bebida = "Aquarius";
                break;
            default:
                System.out.println("Número incorrecto, debe ser entre 1 y 5.");
        }
        System.out.println(bebida);
    }
}
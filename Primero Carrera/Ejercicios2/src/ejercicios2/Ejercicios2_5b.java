package ejercicios2;
import java.util.Scanner;
public class Ejercicios2_5b {
    public static void main(String[] args) {
        //defino un array de 10 enteros
        int arr[] = new int[10];
        
        //El escaner para leer el teclado
        Scanner scanner = new Scanner(System.in);
        
        //leo el primer valor
        System.out.print("Ingrese un valor diferente de 5: ");
        int numero = scanner.nextInt();
        
        int i = 1;
       
        //minetras numero sea distinto de CERO y i sea menor que 10
        while( numero != 5 && i < 10 ) {
            //asigna numero en arr[i] y luego incrementa el valor de i
            i++;
            
            //leo el siguiente valor
            System.out.print("Ingrese un valor diferente de 5: ");
            numero = scanner.nextInt();
        } if (numero == 5){
            System.out.println("Ey, que el número tenía que ser distinto de 5.");
        } else{
            System.out.println("Eres más paciente que yo, tú ganas...");
        }
    }
}



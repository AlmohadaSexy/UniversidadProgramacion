package Ejercicios1;
import java.util.Scanner;
public class Ejercicios1_6_2{
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        //Declaramos el array
        int variable[] = {67108864, 33554432, 16777216, 8388608, 4194304, 2097152, 1048576, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1, 0};
        int i = 0;
        //mensaje para el usuario
        System.out.print("Ingrese un número para convertir a binario(menor o igual que " + ((variable[i] * 2) - 1) + "): ");
        int sol = scanner.nextInt();
        int paroimpar = sol%2;
        System.out.print("Su número " + sol + " convertido a binario es: ");
        while (sol != 0){
            if (sol >= variable[i]){
                sol = sol - variable[i];
                System.out.print("1");
                i++;
            } else{
                i++;
                System.out.print("0");
            }
        } while (paroimpar % 2 == 0 && variable[i] != 0){
            System.out.print("0");
            i++;
        }
    }
}
package Ejercicios1;
import java.util.Scanner;
public class Ejercicios1_6_1{
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
		Scanner scanner = new Scanner(System.in);
        //mensaje para el usuario
        System.out.print("Ingrese una cantidad cualquiera de dinero: ");
        int resto = scanner.nextInt();
        int variable[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        int solucion = 0;
        while (resto != 0){
            if (resto >= variable[i]){
                solucion = resto / variable[i];
                resto = resto % variable[i];
                if ( (variable[i] == 1 || variable[i] == 2) && solucion > 1){
                    System.out.println(solucion + " monedas de " + variable[i] + "€");
                } else{
                    if ( (variable[i] == 1 || variable[i] == 2) && solucion == 1){
                        System.out.println(solucion + " moneda de " + variable[i] + "€");
                    } else {
                        if ((variable[i] != 1 || variable[i] != 2) && solucion == 1){
                            System.out.println(solucion + " billete de " + variable[i] + "€");
                        } else{
                            System.out.println(solucion + " billetes de " + variable[i] + "€");
                        }
                    }
                }
            } else{
                i++;
            }
        }
    }
}
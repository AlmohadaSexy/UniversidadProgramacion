package ejercicios;

import java.util.Scanner;

public class Mehtods1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int acabar = -1;
		int suma = 0;
		int number = 0;
		while(number != acabar) {
			boolean result = hasEight(number);
			if(result == true) {
				suma = suma + number;
			}
			
			System.out.print("Enter a positive integer or -1 to exit: ");
			number = sc.nextInt();
			
		}System.out.println(suma);
	}
    
	
	
	public static boolean hasEight(int number) {
		String numberS = String.valueOf(number);
		int length = numberS.length();
		char digit;
		for(int i = 0; i < length; i++) {
        	digit = numberS.charAt(i);
        	if(digit == '8') {
        		return true;
        	}
		}
		return false;
	}
}
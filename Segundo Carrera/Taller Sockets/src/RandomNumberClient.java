import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class RandomNumberClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la ip del servidor de numeros aleatorios:");
		String serverAddress = sc.nextLine();
		
		
		while (true) {
			// solicitamos el numero del 1 al 6
			System.out.println("Introduce un numero entre el 1 y el 6 para entrar en el sorteo");
			String number = sc.nextLine();

			if(number.equals("salir")) {
				break;
			}
			
			// creamos el socket
			Socket socket = new Socket(serverAddress, 9999);

			// enviar numero al servidor
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println(number);

			// recibimos la respuesta del servidor
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String answer = in.readLine();

			// imprimimos el mensaje
			System.out.println(answer);
			
			socket.close();
		}
		sc.close();
	}
}
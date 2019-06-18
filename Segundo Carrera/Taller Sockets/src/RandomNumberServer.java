import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class RandomNumberServer {
	public static void main(String[] args) throws IOException {
		ServerSocket listener = new ServerSocket(9999);
		System.out.println("Servidor Iniciado");
		try {
			while (true) {
				Socket socket = listener.accept();
				BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				int clientNumber = 0;

				String inputString = input.readLine();

				if (isNumeric(inputString)) {
					clientNumber = Integer.parseInt(inputString);
				}

				Random rndmGenerator = new Random();
				int rndInt = rndmGenerator.nextInt(6) + 1;

				PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
				
				if (clientNumber == rndInt) {
					output.println("El numero " + clientNumber + " ha resultado ganador. Enhorabuena!");
				} else if (!isNumeric(inputString)) {
					output.println(inputString + " ni siquiera es un número.");
				} else if (clientNumber < 1 || clientNumber > 6) {
					output.println("El numero " + clientNumber + " no es válido para el sorteo.");
				} else {
					output.println("Mala suerte, el número premiado ha sido el " + rndInt + ". Inténtalo de nuevo.");
				}
				socket.close();
			} 
		} catch(Exception e){
				
		} finally {
			listener.close();
		}
	}

	public static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}

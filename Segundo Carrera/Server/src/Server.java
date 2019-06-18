
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	public static final int port = 9000;
	static ArrayList<PrintWriter> writers = new ArrayList<>();
	static ArrayList<IdConv> conv = new ArrayList<IdConv>();
	static char separador1 = (char) 186;
	static char separador2 = (char) 185;
	static char errorChar = (char) 187;
	static private String sep1 = "|";
	static private String sep2 = "\\";
	static private String errorStr = "¬";
	
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(port);
		System.out.println("Server socket created");

		while (true) {
			new ClientHandler(server.accept()).start();
			System.out.println("Client accepted");
		}
	}
	
	private static class IdConv {
		
		private int id;
		private PrintWriter receiver;
		
		public IdConv(int id, PrintWriter receiver) {
			this.id = id;
			this.receiver = receiver;
		}
		
		boolean isThisCon(int id) {
			return id == this.id;
		}
		
		PrintWriter getReceiver() {
			return this.receiver;
		}
	}
	
	private static class untilHeConnects extends Thread{
		private int id;
		
		public untilHeConnects(int id) {
			this.id = id;
		}
		
		public int getId1() {
			return this.id;
		}
		public void run() {
			while(true) {
				
			}
		}
	}
	
	private static class ClientHandler extends Thread {
		private Socket client;
		private PrintWriter output;
		private BufferedReader input;
		private IdConv idConv;
		public ClientHandler(Socket client) {
			this.client = client;
		}
		private boolean isConnected(int id) {
			for(IdConv idConver: conv) {
				if(idConver.isThisCon(id)) {
					return true;
				}
			}
			return false;
		}
		public void run() {
			try {
				output = new PrintWriter(client.getOutputStream(), true);
				input = new BufferedReader(new InputStreamReader(client.getInputStream()));
				
				String id = input.readLine();
				idConv = new IdConv(Integer.parseInt(id), output);
				conv.add(idConv);
				System.out.println("writer added");
				while (true) {
					String message = input.readLine();
					String[] splitMessage1 = message.split(sep1);
					String[] splitMessage2 = splitMessage1[0].split(sep2);
					System.out.println("RECEIVER ID>> " + splitMessage2[0]);
					System.out.println("SENDER ID>> " + splitMessage2[1]);
					System.out.println("SENT MESSAGE>> " + splitMessage1[1]);
					
					if(isConnected(Integer.parseInt(splitMessage2[0]))) { 
						for(IdConv idConver: conv) {
							if(idConver.isThisCon(Integer.parseInt(splitMessage2[0]))) {
								idConver.getReceiver().println(splitMessage2[1] + sep1 + splitMessage1[1]);
							}
						}
					} else {
						for(IdConv idConver: conv) {
							if(idConver.isThisCon(Integer.parseInt(splitMessage2[1]))) {
								idConver.getReceiver().println(splitMessage2[0] + sep1 + errorStr);
							}
						}
					}
				}
			} catch (Exception e) {

			} finally {
				conv.remove(idConv);
				
				try {
					client.close();
				} catch (Exception e) {

				}
				System.out.println("writer disconnected");
			}
		}
	}

}

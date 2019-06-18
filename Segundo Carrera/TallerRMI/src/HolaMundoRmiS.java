import java.rmi.*;
import java.rmi.server.*;
public class HolaMundoRmiS {
	public static void main(String[] args) {
		try {
			//Se instala el controlador de seguridad
			if(System.getSecurityManager() == null) {
				System.setSecurityManager(new RMISecurityManager());
			}
			HolaMundoRmiO objRemoto = new HolaMundoRmiO();
			Naming.rebind("ObjetoHola", objRemoto);
			System.out.println("Objeto remoto preparado");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

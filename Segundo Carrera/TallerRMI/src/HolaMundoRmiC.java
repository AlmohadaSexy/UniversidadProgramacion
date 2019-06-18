import java.rmi.*;

public class HolaMundoRmiC {
	public static void main(String[] args) {
		//Direcccion de la maquina remota, en esta caso la maquina local. Si se va a ejecutar en una maquina diferente se debera cambiar a algo semejante a : "rmi://www.servidor.com"
		String direccion = "rmi://localhost/";
		try {
			HolaMundoRmiI hm = (HolaMundoRmiI)Naming.lookup(direccion + "ObjetoHola");
			System.out.println(hm.objRemotoHola("Mundo REMOTO!"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}

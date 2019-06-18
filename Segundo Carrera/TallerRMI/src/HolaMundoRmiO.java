import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class HolaMundoRmiO extends UnicastRemoteObject implements HolaMundoRmiI{

	protected HolaMundoRmiO() throws RemoteException {
		super();
	}

	public String objRemotoHola(String cliente) throws RemoteException {
		return ("Hola " + cliente);
	}

}

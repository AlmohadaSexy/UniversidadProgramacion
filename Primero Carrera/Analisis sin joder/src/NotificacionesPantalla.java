import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class NotificacionesPantalla {
	
	String value1, value2, value3;
	static double E;
	static double Dh;
	static double Re;
	
	public void input() {
		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JTextField field3 = new JTextField();
		Object[] message = {
			"Valor de E", field1,
		    "Valor de Dh", field2,
		    "Valor de Re", field3,
		};
		int option = JOptionPane.showOptionDialog(null, message, "Introduce los valores", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Calcula!", "Exit"}, "default");
		if (option == JOptionPane.OK_OPTION) {
		    value1 = field1.getText();
		    value2 = field2.getText();
		    value3 = field3.getText();
		    E = Double.parseDouble(value1);
		    Dh = Double.parseDouble(value2);
		    Re = Double.parseDouble(value3);  
		} else {
			System.exit(0);
		}
	}
	public void solucion(double x, double resulfin) {
		JOptionPane.showMessageDialog(null, "x es igual a " + x + "\nf es igual a " + resulfin, "Solución", JOptionPane.PLAIN_MESSAGE);
	}
	public double returnE() {
		return E;
	}
	public double returnDh() {
		return Dh;
	}
	public double returnRe() {
		return Re;
	}
}
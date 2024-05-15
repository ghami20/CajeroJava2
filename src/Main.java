import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {


		String[] rol = {
			"Cliente","Empleado","Salir"	
		};
		Cajero cajero1 = new Cajero("Corrientes",1000);
		Cajero cajero2 = new Cajero("Callao",0);
		
		String[] cajeros = {
				"Corrientes","Callao"
		};
		int elegido=0;
		do {
			elegido = JOptionPane.showOptionDialog(null, "Elija el rol", null, 0, 0, null, rol, rol[0]);
			int opcion = JOptionPane.showOptionDialog(null, "Elija cajero", null, elegido, elegido, null, cajeros, cajeros);
			Cajero seleccionado= null;
			if (opcion==0) {
				seleccionado= cajero1;
			} else {
				seleccionado= cajero2;

			}
		switch (elegido) {
		case 0:
			Cliente yo = new Cliente("Gamalie","12345678","Quiroz",elegido,1234,1);
			String dni = JOptionPane.showInputDialog("Ingrese usuario(dni)");
			int pin = Integer.parseInt(JOptionPane.showInputDialog("Ingresa pin"));
			
			if (yo.IngresarAlCajero(dni, pin)) {
				JOptionPane.showMessageDialog(null, "Pudo ingresar");
				yo.menu(seleccionado);
			} else {
				JOptionPane.showMessageDialog(null, "No pudo ingresar");
			} 
			
			break;
		case 1: 
			
			Empleado otro = new Empleado("Natanael","87654321","Quiroz",elegido,1234,"Noche");
			 dni = JOptionPane.showInputDialog("Ingrese usuario(dni)");
			 pin = Integer.parseInt(JOptionPane.showInputDialog("Ingresa pin"));
			
			if (otro.IngresarAlCajero(dni, pin)) {
				JOptionPane.showMessageDialog(null, "Pudo ingresar");
				otro.menu(seleccionado);
			} else {
				JOptionPane.showMessageDialog(null, "No pudo ingresar");
			} 
			
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Salir");
			break;
		}
		} while (elegido!=2);

	
	
	}
}

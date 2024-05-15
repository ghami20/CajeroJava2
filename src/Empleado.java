import javax.swing.JOptionPane;

public class Empleado extends Usuario{
	private String turno;

	public Empleado(String nombre, String dni, String apellido, int rol, int pin, String turno) {
		super(nombre, dni, apellido, rol, pin);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Empleado [turno=" + turno + "]";
	}
	public boolean MantenerCajero(Cajero cajero,int monto) {
		
		return true;
	}
	
	@Override
	public void menu(Cajero cajero) {
		JOptionPane.showMessageDialog(null, "Estoy en el menu empleado");
		String[] opciones = { "Recargar dinero", "ver estado", "Salir" };
		int opcion = 0;
		do {
			opcion = JOptionPane.showOptionDialog(null, "Elija una opción", "Cajero", 0, 0, null, opciones,
					opciones[0]);

			switch (opcion) {
			case 0:
				int monto =0; 

				do {
					 monto = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el monto"));
				} while (monto< 1);
			 cajero.setSaldo(cajero.getSaldo()+monto);
				
				break;
			case 1:
				JOptionPane.showMessageDialog(null, cajero);
			case 2:
				JOptionPane.showMessageDialog(null, "Salir");
				break;
			default:
				break;
			}
		} while (opcion != 2);
		
	}
	
}

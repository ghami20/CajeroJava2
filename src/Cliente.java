import javax.swing.JOptionPane;

public class Cliente extends Usuario {

	private int nroCliente;

	public Cliente(String nombre, String dni, String apellido, int rol, int pin, int nroCliente) {
		super(nombre, dni, apellido, rol, pin);
		this.nroCliente = nroCliente;
	}

	public int getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}

	@Override
	public String toString() {
		return "Cliente [nroCliente=" + nroCliente + "]";
	}

	@Override
	public void menu(Cajero cajero) {
		JOptionPane.showMessageDialog(null, "Estoy en el menu cliente");
		String[] opciones = { "Retirar dinero", "depositar dinero", "ver cuenta", "Salir" };
		int opcion = 0;
		Cuenta corriente = new Cuenta(this, 1000, "Movimientos \n");
		do {
			opcion = JOptionPane.showOptionDialog(null, "Elija una opción", "Cajero", 0, 0, null, opciones,
					opciones[0]);

			switch (opcion) {
			case 0:
				int monto =0; 

				do {
					 monto = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el monto"));
				} while (monto< 1);
				if (corriente.RetirarDinero(monto, cajero)) {
					JOptionPane.showMessageDialog(null, "Pudo retirar dinero ! le queda en la cuenta" + corriente.getSaldo());
				} else {
					JOptionPane.showMessageDialog(null, "No pudo sacar plata");
				}
				break;
			case 1:

				break;
			case 2:
				JOptionPane.showMessageDialog(null, "información de cuenta : " + corriente.getCliente() + "\n transacciones " +  corriente.getTransacciones() + "\n saldo restante " + corriente.getSaldo());
				break;
			case 3:

				break;
			default:
				break;
			}
		} while (opcion != 3);

	}

}

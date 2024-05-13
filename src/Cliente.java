
public class Cliente extends Usuario{

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
	
	
	
}

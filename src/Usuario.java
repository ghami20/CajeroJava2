import javax.swing.JOptionPane;

public abstract class Usuario {
	private String nombre;
	private String dni;
	private String apellido;
	private int rol;
	private int pin;
	public Usuario(String nombre, String dni, String apellido, int rol, int pin) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.apellido = apellido;
		this.rol = rol;
		this.pin = pin;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", dni=" + dni + ", apellido=" + apellido + ", rol=" + rol + ", pin=" + pin
				+ "]";
	}
	public boolean IngresarAlCajero(String dni,int pin) {
		if (this.getDni().equals(dni) && this.getPin()==pin) {
			return true;
		} else {
			return false;

		}
		
	}
	
	public void menu(Cajero cajero) {
		JOptionPane.showMessageDialog(null, "Estoy en el menu");
	}
		
}

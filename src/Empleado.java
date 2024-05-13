
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
	
}

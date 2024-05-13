
public class Cuenta {

	private Cliente cliente;
	private double saldo;
	private String transacciones;
	public Cuenta(Cliente cliente, double saldo, String transacciones) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
		this.transacciones = transacciones;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTransacciones() {
		return transacciones;
	}
	public void setTransacciones(String transacciones) {
		this.transacciones = transacciones;
	}
	@Override
	public String toString() {
		return "Cuenta [cliente=" + cliente + ", saldo=" + saldo + ", transacciones=" + transacciones + "]";
	}
	public boolean RetirarDinero(int monto, Cajero cajero) {
		return true;

	}
	public boolean DepositarDinero(int monto,Cajero cajero) {
		return true;
	}
	
}

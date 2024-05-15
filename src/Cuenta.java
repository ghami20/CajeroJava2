import java.time.LocalDateTime;

import javax.swing.JOptionPane;

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
		
		if (this.getSaldo()>monto) {
			if (cajero.getSaldo()>monto) {
				this.setTransacciones(this.getTransacciones() + "Se retiró dinero en el horario " + LocalDateTime.now().getHour() +  " "  + LocalDateTime.now().getMinute() + " monto a extraer :"+ monto + "\n");
				this.setSaldo(this.getSaldo()-monto);
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "No hay saldo disponible en el cajero");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(null, "No tenes dinero suficiente en cuenta");
			return false;

		}
	}
	public boolean DepositarDinero(int monto,Cajero cajero) {
		return true;
	}
	
}

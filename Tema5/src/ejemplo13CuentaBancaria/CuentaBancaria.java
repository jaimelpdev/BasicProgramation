package ejemplo13CuentaBancaria;

public class CuentaBancaria {

	private int saldo;

	CuentaBancaria(int saldo) {
		this.saldo = saldo;
	}

	public void depositar(int cantidad) {
		saldo = saldo + cantidad;
	}

	public void depositar(int cantidad, int comision) {
		double cantidadReal = cantidad - comision * cantidad / 100;
		saldo += cantidadReal;
	}

	public boolean retirar(int cantidad) {
		if (cantidad <= saldo) {
			saldo = saldo - cantidad;
			return true;
		}
		return false;
	}

	public boolean retirar(int cantidad, int comision) {
		int cantidadReal = cantidad + comision * cantidad / 100;
		if (cantidadReal <= saldo) {
			saldo = saldo - cantidadReal;
			return true;
		}
		return false;
	}

	public int obtenerSaldo() {
		return saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}

package electrodomesticos;

public class Lavadora {

	private int id;
	private Motor motor;
	private String marca;
	private float precio;
	private static int iva;

	public Lavadora(int id, Motor motor, String marca, float precio) {
		this.id = id;
		this.motor = motor;
		this.marca = marca;
		this.precio = precio;
		this.iva = iva;
	}

	public String toString() {
		return "ID: " + id + ", Motor: " + motor.getFabricante() + ", Marca: " + marca + ", Precio: " + precio + " €.";
	}

	public int getId() {
		return id;
	}

}

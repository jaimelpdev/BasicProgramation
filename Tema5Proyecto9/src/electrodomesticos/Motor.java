package electrodomesticos;

public class Motor {

	private int id;
	private String fabricante, modelo;

	public Motor(int id, String fabricante, String modelo) {
		super();
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

}

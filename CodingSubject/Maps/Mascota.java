package Maps;

import java.util.Objects;

public class Mascota {

	private int id;
	private String nombre, tipo;

	public Mascota(int id, String nombre, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return id + " " + nombre + " " + tipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		Mascota mascota = (Mascota) obj;

		if (id == mascota.id && nombre.equals(mascota.nombre) && tipo.equals(mascota.tipo)) {
			return true;
		}

		return false;

	}

}

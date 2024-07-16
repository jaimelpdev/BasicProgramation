package Lists;

public class Mascota {

	private String nombre, raza;
	private int edad;

	public Mascota(String nombre, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	// TODO: Crear un método equals que compare dos mascotas mirando todos sus
	// atributos.
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
		if(nombre.equals(((Mascota) obj).getNombre()) && raza.equals(((Mascota) obj).getRaza()) && edad == ((Mascota) obj).getEdad()) {
			return true;
		}
		
		return false;
	}

	private String getNombre() {
		return nombre;
	}

	private String getRaza() {
		return raza;
	}

	private int getEdad() {
		return edad;
	}

}

package Maps;

public class Ficha {

	private int anyoNacimiento;
	private String nacionalidad, visa;

	public Ficha(int anyoNacimiento, String nacionalidad, String visa) {
		super();
		this.anyoNacimiento = anyoNacimiento;
		this.nacionalidad = nacionalidad;
		this.visa = visa;
	}

	@Override
	public String toString() {
		return "Año de nacimiento: " + anyoNacimiento + "\nNacionalidad: " + nacionalidad + "\nVISA: " + visa;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

}

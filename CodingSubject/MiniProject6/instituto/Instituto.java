package instituto;

import auxiliar.Alumno;

public class Instituto {

	private final int MAX_ALUMNOS = 5;
	private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];

	public void addAlumno(Alumno alu) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alu;
				return;
			}
		}
	}

	public void delAlumno(int numExp) {
		int pos = buscaAlumno(numExp);
		if(pos != -1) {
			alumnos[pos] = null;
		}
	}

	public void muestraAlumnos() {
		System.out.println("*** DATOS DE ALUMNOS ***");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i].toString());
			}
		}
	}

	public int numAlumnos() {
		int numAlumnos = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				numAlumnos++;
			}
		}
		return numAlumnos;
	}

	public int buscaAlumno(int numExp) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {
				return i;
			}
		}
		return -1;
	}

}

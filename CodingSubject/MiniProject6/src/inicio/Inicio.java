package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {
	
	Grupo g1 = new Grupo(12, "ESO", 3, "B");
	Alumno a1 = new Alumno(1, "López", "Jaime", g1);
	Alumno a2 = new Alumno(2, "Hernandez", "Oscar", g1);
	Instituto instituto1 = new Instituto();
	
	instituto1.addAlumno(a1);
	instituto1.addAlumno(a2);
	instituto1.muestraAlumnos();
	
	instituto1.delAlumno(2);
	instituto1.muestraAlumnos();
	
	System.out.println(instituto1.buscaAlumno(1));
	
	}
	
}
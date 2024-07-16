package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {

		// Creamos un objeto Grupo pásandole los datos en el constructor.
		Grupo grupo1 = new Grupo(12, "Eso", 3, "B");

		System.out.println(grupo1.toString());

		// Creamos un objeto Grupo sin pasarle ningún dato, y luego usamos leeDatos()
		// para inicializar todos sus atributos.
		Grupo grupo2 = new Grupo();

		// grupo2.leeDatos();
		// System.out.println(grupo2.toString());

		// Creamos un objeto Alumno pasándole los datos al constructor.
		Alumno alumno1 = new Alumno(100, "Pérez López", "Luis", grupo1);
		System.out.println(alumno1.toString());

		// Creamos un objeto Alumno llamando al método leeDatos().
		Alumno alumno2 = new Alumno(101, "Ramirez", "Carlos", grupo1);
		System.out.println(alumno2.toString());

		Instituto instituto1 = new Instituto();

		instituto1.addAlumno(alumno1);
		instituto1.muestraAlumnos();
//		System.out.println(instituto1.numAlumnos());
		
		instituto1.addAlumno(alumno2);
		instituto1.muestraAlumnos();
//		System.out.println(instituto1.numAlumnos());

		instituto1.delAlumno(100);
		instituto1.muestraAlumnos();
//		System.out.println(instituto1.numAlumnos());
		
		int numExp = 100;

		if (instituto1.buscaAlumno(numExp) == -1) {
			System.out.println("El alumno con el número de expediente " + numExp + " no se ha encontrado.");
		} else {
			System.out.println("El alumno con el número de expediente " + numExp + " se ha encontrado.");
		}
	}

}

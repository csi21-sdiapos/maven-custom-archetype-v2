package modelos.DTOs;
/*
 * AsignaturaDTO -- >Clase que utilizaremos para manejar los datos extraidos de nuestra base de datos en forma de objeto, concretamente de 
 * la clase asignatura
 */

public class AsignaturaDTO {
//	Generamos los campos que utilizaremos
	private static int idAsignatura;
	private static String nombre;
//	Generamos los getters
	public static int getIdAsignatura() {
		return idAsignatura;
	}
	public static String getNombre() {
		return nombre;
	}
//	Generamos el constructor
	public AsignaturaDTO(int idAsignatura, String nombre) {
		this.idAsignatura = idAsignatura;
		this.nombre = nombre;
	}

}

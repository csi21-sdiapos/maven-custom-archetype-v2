package modelos.DTOs;

/*
 * AlumnoDTO --> Clase que utilizaremos para manejar los datos extraidos de nuestra base de datos en forma de objeto, concretamente de 
 * la clase alumno
 */
public class AlumnoDTO {

//		Declaramos las columnas de nuestra tabla alumno
	private static int idAlumno;
	
	private static String nombre;
	private static String apellidos;
	private static String email;
	public static int edad;
	private static String direccion;

//		Generamos los getters
	public int getIdAlumno() {
		return idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getEdad() {
		return edad;
	}

//		Creamos su constructor
	public AlumnoDTO(int idAlumno, String nombre, String email, int edad, String direccion) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.direccion = direccion;
	}

//		ToString()
	public  String getAlumno() {
		return "[ALUMNO] idAlumno= " + idAlumno + " Nombre= " + nombre + " Apellidos= "+ apellidos  +  "E-mail="  + email +  "direccion= "  + direccion;
	}

}
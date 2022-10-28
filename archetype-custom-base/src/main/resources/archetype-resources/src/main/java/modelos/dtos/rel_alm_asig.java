package modelos.DTOs;

public class RelAlumnoAsignaturasDTO {
	
//	Declaramos las columnas de nuestra tabla alumno
	private static int idRelacion;
	private static int idAlumno;
	private static int idAsignatura;
	
	
//	Generamos los getters
	public static int getIdRelacion() {
		return idRelacion;
	}
	public static int getIdAlumno() {
		return idAlumno;
	}
	public static int getIdAsignatura() {
		return idAsignatura;
	}
//	Generamos el constructor
	public RelAlumnoAsignaturasDTO(int idRelacion,int idAlumno, int idAsignatura) {
		
		this.idRelacion = idRelacion;
		this.idAsignatura = idAsignatura;
		this.idAlumno = idAlumno;
	}

	

}

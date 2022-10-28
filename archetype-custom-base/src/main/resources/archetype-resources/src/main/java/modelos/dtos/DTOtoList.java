package modelos.DTOs;
import java.sql.*;
import java.util.*;

/*
 * DTOsToList --> Clase que utilizaremos para crear listas que contengan objetos del tipo que necesitemos para trbajar con los datos
 */

public class DTOsToList {
	
//	Creamos el metodo generaLista que recibe un ResultSet y devuelve una lista del tipo alumno
	public static ArrayList<AlumnoDTO> generarListaAlumnos(ResultSet rs) {

		System.out.println("[INFO] -- Entrando en modelos.DTOs.DTOtoList");
		ArrayList<AlumnoDTO> resultToList = new ArrayList<AlumnoDTO>();

//		Creamos objetos del tipo productoDTO con los resultados obtenidos y los añadimos a la lista
		try {
//			Creamos los alumnos de la lista y los guardamos en ella
			while (rs.next()) {
				resultToList.add(new AlumnoDTO(rs.getInt("idAlumno"), rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("edad"), rs.getString("direccion")));
				
			}

		} catch (Exception e) {
			System.out.println("[ERROR] -- modelos.DTOtoList.generarListaAlumnos -- " +  e.toString());
		}
		
		System.out.println("[INFO] -- Saliendo de modelos.DTOs.DTOtoList.generarListaAlumnos");
		return resultToList;

	}

}
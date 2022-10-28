package modelos.Consultas;

import java.sql.*;

/*
 * ConsultasDelete --> Clase que nos permite eliminar registros de la base de datos
 */

public class ConsultasDelete {
//	Con este metodo elimimos alumnos
	public static void eliminarAlumno(Connection conn) {
//		Declaramos la sentencia sq
		String sql = "DELETE FROM \"basicDatabase\".\"alumnos\"  WHERE  \"alumnos\".idAlumno>=100;";
		//Eliminamos a partir de la columna 10 ya que no he sido capaz de hacer que restaure el id de un registro previamente realizado
		System.out.println("[INFO] -- modelos.consultas.ConsultasUpdates.deleteAlumno -- Realizando delete");
		try {
//			Declaramos el statement y lo ejecutamos
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("[ERROR] -- modelos.consultas.ConsultasUpdates.deleteAlumno -- " + e.toString());
		}
		System.out.println("[INFO] -- modelos.consultas.ConsultasUpdates.deleteAlumno -- Saliendo de deleteAlumno");

	}

}

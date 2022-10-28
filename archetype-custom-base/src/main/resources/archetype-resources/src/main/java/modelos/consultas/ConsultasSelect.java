package modelos.Consultas;

import java.sql.*;
/*
 * ConsultasSelect --> Clase que nos permite realizar consultas del tipo select a la base de datos
 */

public class ConsultasSelect {

//	Consulta que nos devuelve todos los datos de la tabla a traves de un ResultSet
	public static ResultSet selectEverything(Connection conn) {

		System.out.println("[INFO] Entrando en modelos.consultas.ConsultasSelect.selectEverything");
		// Declaramos la consulta sql
		String sql = "SELECT * FROM \"basicDatabase\".\"alumnos\"";
		try {

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			// En caso de que funcione, devolvemos el ResultSet directamente
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[INFO] -- modelos.consultas.ConsultasSelect.selectEverything -- " + e.toString());
		}
		System.out.println("[INFO] -- Saliendo de modelos.consultas.ConsultasSelect.selectEverything");
		// En caso de que no funcione, devolvemos un 'null'
		return null;
	}

}
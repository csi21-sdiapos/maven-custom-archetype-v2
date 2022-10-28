package modelos.Consultas;
import java.sql.*;

/*
 * ConsultasInsert --> Clase que se encarga de realizar los inserts en la base de datos
 */

public class ConsultasInsert {
	
	//Clase que inserta que utilizamos para insertar un registro en la base de datos
	public static void insertAlumno(Connection conn) {

		System.out.println("[INFO] -- Entrando en modelos.consultas.ConsultasInsert.insertAlumno");
		try {			
			Statement st = conn.createStatement();
			//Declaramos el string de sql y lo ejecutamos
			String sql = "Insert into \"basicDatabase\".\"alumnos\" VALUES (Default, \'TestMaven\', \'TestMaven\', 25, \'TestMaven\')";
			st.execute(sql);
			// Cerramos la conexión			

		} catch (Exception e) {
			System.out.println("[ERROR] -- modelos.consultas.ConsultasInsert.insertAlumno -- " + e.toString());
		}
		System.out.println("[INFO] -- Saliendo de modelos.consultas.ConsultasInsert.insertAlumno");

	}

}
package modelos;

/*
 * Util -- > Clase en la que almacenamos los datos de inicio de sesion para la base de datos
 */

public class Util {

//		Declaramos las constantes y las inicializamos
	static final String HOST = "localhost";
	static final String PASSW = "root123";
	static final int PORT = 5432;
	static final String DB = "General";
	static final String USER = "postgres";

//		Definimos los metodos por los que accederemos a las constantes
	public static String getHost() {
		return HOST;
	}

	public static String getPassw() {
		return PASSW;
	}

	public static int getPort() {
		return PORT;
	}

	public static String getDb() {
		return DB;
	}

	public static String getUser() {
		return USER;
	}

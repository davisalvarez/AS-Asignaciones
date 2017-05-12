/*
 * UVG
 * Analisis de Sistemas
 *
 * Autor: Davis Alvarez - 15842
* Clase Conexion :Esta clase  ayuda a comunicarse con la DB.
*/
//paquetes usados en esta clase:
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Conexion{
	private Connection conexion;
	private Statement statement;
	private static Conexion instancia;
	public static Conexion getInstancia(){
		if(instancia==null)
			instancia=new Conexion();
		return instancia;
	}
	private Conexion(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException cne){

		}
		try{
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/idUsuaio?user=root&password=root");
			statement = conexion.createStatement()t
		}catch(SQLException e){
			System.out.println("ERROR!!");
		}
	}
	public boolean ejecutarSentencia(String sentencia){
		try{
			return statement.execute(sentencia);
		}catch(SQLException e){

		}
		return false;
	}
	public ResultSet ejecutarConsulta(String consulta){
		ResultSet resultado = null;
		try{
			resultado = statement.executeQuery(consulta);
		}catch(SQLException e){

		}
		return resultado;

	}
}

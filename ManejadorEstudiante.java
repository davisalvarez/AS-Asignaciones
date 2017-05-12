import java.sql.ResultSet;
import java.sql.SQLException;

public class ManejadorEstudiante{
	private Estudiante estudiante;
	private static ManejadorEstudiante instancia;
	private ManejadorEstudiante(){
		estudiante=new Estudiante();
	}
	public static ManejadorEstudiante getInstancia(){
		if(instancia==null)
			instancia=new ManejadorEstudiante();
		return instancia;
	}
	public Estudiante getEstudiante(){
		return this.usuario;
	}
	public void desconectar(){
		this.usuario=null;
	}
	public boolean iniciarSesion(String usuario, String passU){
		String consulta="SELECT * FROM Estudiante WHERE Estudiante.nombreU='"+usuario+"' AND Estudiante.passU='"+passU+"';";
		ResultSet resultado = Conexion.getInstancia().ejecutarConsulta(consulta);
		try{
			if(resultado!=null){
				while(resultado.next()){
					this.usuario.setNombreP(resultado.getString("nombreP"));
					this.usuario.setIdUsuario(resultado.getInt("idUsuario"));
					return true;
				}
			}
		}catch(SQLException e){}
		return false;
	}
}

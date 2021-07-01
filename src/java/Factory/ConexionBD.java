package Factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class ConexionBD {
    protected String[] parametros;
    protected Connection conexion;
    
    abstract Connection open();
    
    //Método que se encarga de ejecutar la consulta.
    public ResultSet consultaSQL(String consulta){
        //Objeto Statement es el encargado de ejecutar las consultas.
        Statement st;
        //Tabla temporal donde se almacenan los datos.
        ResultSet rs = null;
        try{
            st = conexion.createStatement();
            rs = st.executeQuery(consulta);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return rs;        
    }
    
    
     //Método para ejecutar.
    public boolean ejecutarSQL(String consulta){
        //Objeto Statement es el encargado de ejecutar las consultas.
        Statement st;
        boolean guardar = true;
        
        try{
            st = conexion.createStatement();
            st.executeUpdate(consulta);
            
        }catch(SQLException ex){
            guardar = false;
            ex.printStackTrace();
        }
        
        return guardar;        
    }
    
    
    //Método para cerrar la conexión.
    public boolean cerrarConexion(){
        boolean ok = true;
        try{
            conexion.close();
        }catch(Exception ex){
            ok = false;
            ex.printStackTrace();
        }
        return ok;  
    }
    
    
    
}

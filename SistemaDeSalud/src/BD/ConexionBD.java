/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class ConexionBD {
    
    public static final String URL = "jdbc:mysql://localhost:3306/db_ars";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "123456";
    
    PreparedStatement ps;
     ResultSet Res;
    
     
    
    
    public static Connection getConection(){
        
        
        Connection Conexion = null; //variable tipo conexion
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Conexion =(Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD); //mando los datos por parametros
            System.out.println("Exito");
            
            
        }catch(Exception e){
             
            JOptionPane.showMessageDialog(null, "Conexion Fallo" + e);
            
        }//fin trycatch
        
        return Conexion;
        
        
    }//fin metodo getconnection
    

    public static void main (String[]args){
        
        
        getConection();
        
        
        /*try{ //prueba de la conexion
            
            Connection Conexion = null;
            Conexion = getConection();
            
            PreparedStatement ps;
            ResultSet Res;
            
            
            
            ps = Conexion.prepareStatement("SELECT * FROM usuarios");
            Res = ps.executeQuery();
            
            if(Res.next()){
                
                JOptionPane.showMessageDialog(null, "+Nombre: " + Res.getString("UsuarioNombre")+ "  +clave: " + Res.getString("UsuarioClave"));
                
            }else{
                JOptionPane.showMessageDialog(null, "NO HAY DATOS");
            }
         
            Conexion.close();
            
            
           
        }catch(Exception e){
          
            JOptionPane.showMessageDialog(null, e);
            
            
        }*/
        
        
        
    }
    
    
    
    
}//fin clase

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcdav1d;

import java.sql.*;

 
public class JDBCDAV1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario = "root";
        String password = "Lilo1038*";
        String url = "jdbc:mysql://localhost:3306/coindex";
        
        Connection conexion;
        Statement statement;
        ResultSet rs; 
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.getLogger(JDBCDAV1D.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        try {
            conexion=DriverManager.getConnection(url,usuario,password);
            statement=conexion.createStatement();
            rs=statement.executeQuery("select * from productos"); 
            while(rs.next()){
                 System.out.println(rs.getInt("id")+":"+rs.getString("nombre"));
            
        }
        } catch (SQLException ex) {
            System.getLogger(JDBCDAV1D.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
}

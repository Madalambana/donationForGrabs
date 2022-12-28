import java.sql.*;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex Madalambana
 */
public class javaconnect {
    
    public static Connection connectdb(){
    Connection con = null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tp","root","jpxfrd32");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author KINGSLEY
 */
import java.sql.* ;
public class Index {

    /**
     * @param args the command line arguments
     * 
     *
     */
    
        
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
        static final String DB_URL = "jdbc:mysql://localhost/savedb";
         
        static final String USER = "root";
        static final String PASS = "";
        
        

    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
         
        Class.forName("com.mysql.jdbc.Driver"); // registers the jdbc driver 
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
        
        login newlogin = new login(conn);
        newlogin.setVisible(true);
    }
    
}

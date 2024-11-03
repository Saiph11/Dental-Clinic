/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dow;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getCon(){
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/dental";
                String user = "root";
                String password = "padabaKO21";
                Connection con = DriverManager.getConnection(url, user, password);
                return con;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }

    }

}

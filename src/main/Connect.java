/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author K.Nono
 */
    import java.sql.*;


public class Connect {
    private static Connection conn;
  //pour permettre à different  objet d'une même classe de disposer d'infos collective.
    public static Connection getConn() {
           try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DRIVER OK ! ");

			String url = "jdbc:mysql://localhost:3306/7minutes";
			String user = "root";
			String passwd = "kokou";

			conn = DriverManager.getConnection(url, user, passwd);
                 System.out.println("DRIVER OK ! ");
		}
                catch (Exception e) {
			e.printStackTrace();
		}
       return conn;
    }

}

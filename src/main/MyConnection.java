/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yvesco
 */
public class MyConnection {
     private final String username="root";
    private final String password="kokou";
    private final String URL="jdbc:mysql://localhost:3306/goldenteam";
    private java.sql.Connection connection;
    private  Statement statement;
    private static MyConnection instance;
   
    private MyConnection() throws SQLException {
        connection=DriverManager.getConnection(URL, username, password);
        statement=connection.createStatement();
    }
    
    public static MyConnection getConnection() throws SQLException{
        if(instance==null){
            return new MyConnection();
        }else{
            return instance;
        }
    }
    public Statement getStatement(){
        return statement;
    }
    public void setSatement(Statement st){
        this.statement=st;
    }

}

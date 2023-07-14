package com.p;
import java.sql.*;
public class Connex implements Constant{
    static Connection con=null;
    public static Connection getCon(){
        try{
        Class.forName("org.postgresql.Driver");
        con=DriverManager.getConnection(connURL,n,mdp);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}

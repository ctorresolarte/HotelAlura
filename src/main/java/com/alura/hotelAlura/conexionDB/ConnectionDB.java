package com.alura.hotelAlura.conexionDB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {

    public static void main(String[] args) throws ClassNotFoundException {
        ConnectionDB con1 = new ConnectionDB("hotelalura2");
        con1.Conectar();
    }
    
    private final String url = "jdbc:mysql://localhost:3307/";
    private  String db = "hotelalura2";
    private final String user = "root";
    private final String password = "Bandit0@bandit";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    public ConnectionDB(String db) {
        this.db = db;
    }

    public ConnectionDB() {
    }

    protected Connection con;

    public Connection Conectar() throws ClassNotFoundException {
        try {
            con = DriverManager.getConnection(url + db, user, password);
            Class.forName(driver);
            System.out.println("Se ha establecido la conexion a la base de datos: " + db);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("NO se ha establecido la conexion a la base de datos: " + db +" "+ex);
        }
        return con;
    }

    public void Desconectar(){
        try {
            con.close();
            System.out.println("Conexion finalizada");
        } catch (Exception e) {
            System.out.println("Error al finalizar la conexion");
        }
    }


}

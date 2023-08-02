package com.shehan.pos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    // create database & tables if not exists
    private static DbConnection dbConnection;
    private Connection connection;

    private DbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop",
                "root","As@2230342#");
    }
    public static DbConnection getInstance() throws SQLException, ClassNotFoundException {
        return (dbConnection==null)?dbConnection= new DbConnection():dbConnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
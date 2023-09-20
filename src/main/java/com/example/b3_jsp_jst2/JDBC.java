package com.example.b3_jsp_jst2;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    private String hostName = "localhost:3306";
    private String dbName = "product";
    private String userName = "root";
    private String password = "Duykhanh123@";
    private String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;
    public Connection connection() throws SQLException {
        Connection connection = DriverManager.getConnection(connectionURL,userName,password);
        return connection;
    }
}

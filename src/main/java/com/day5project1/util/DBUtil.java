package com.day5project1.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() {
        Connection con = null;
        try {
            // load the postgresql jdbc driver
            Class.forName("org.postgresql.Driver");
            // establish a connection to database
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres", "postgres", "root@123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

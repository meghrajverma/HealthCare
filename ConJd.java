package com.example.JdbcConn;

import java.sql.*;

public class ConJd {
    public void getIssue() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Example");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "   " + rs.getString(2));
                conn.close();
            }}
		catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

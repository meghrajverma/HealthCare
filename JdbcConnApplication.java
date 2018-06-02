package com.example.JdbcConn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.sql.DataSource;
import java.sql.*;
import java.sql.SQLException;

@SpringBootApplication
public class JdbcConnApplication {
	@Bean
	public DataSource dataSource()
	{
				return DataSourceBuilder.create().url("jdbc:mysql://localhost:3306/java_db").password("MeghrajMahar106").driverClassName("com.mysql.jdbc.Driver").username("root").build();
	}


	public static void main(String[] args) {

		SpringApplication.run(JdbcConnApplication.class, args);
	}
}
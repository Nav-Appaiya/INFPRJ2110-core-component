package com.example.Connector;

import com.example.Entities.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nav on 29-12-15.
 */
public class JDBCTemplate {

    public static void main(String[] args) throws SQLException {
        System.out.println( "Hello spring!" );
    }

    public void secondMain(){
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        try {
            dataSource.setDriver(new com.mysql.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace( );
        }
        dataSource.setUrl("jdbc:mysql://localhost/citygis");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sqlInsert = "INSERT INTO user (name, email, address, telephone)" + " VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sqlInsert, "Tom", "tomea@mail.com", "USA", "12345");
        String sqlUpdate = "UPDATE contact set email=? where name=?";
        jdbcTemplate.update(sqlUpdate, "tomee@mail.com", "Tom");
        String sqlSelect = "SELECT * FROM contact";

        String sqlDelete = "DELETE FROM contact1 where name=?";
        jdbcTemplate.update(sqlDelete, "Tom");
    }
}
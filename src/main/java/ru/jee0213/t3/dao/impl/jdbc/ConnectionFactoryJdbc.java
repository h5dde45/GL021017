package ru.jee0213.t3.dao.impl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryJdbc implements ConnectionFactory {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/production_eshop";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";

    @Override
    public Connection newConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL,LOGIN,PASSWORD);
    }

    @Override
    public void close() throws SQLException {

    }
}

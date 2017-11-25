package ru.jee0213.t3.dao.impl.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionFactory {
     Connection newConnection() throws SQLException;
     void close() throws SQLException;
}

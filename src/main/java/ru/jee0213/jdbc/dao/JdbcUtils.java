package ru.jee0213.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
    private static boolean initialized;

    public JdbcUtils() {
    }

    public static synchronized void initDriver(String driverClass) {
//        if (!initialized) {
//            try {
//                Class.forName(driverClass);
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//                throw new RuntimeException("Can't initialize driver: '" + driverClass + "'");
//            }
//            initialized = true;
//        }
    }

    public static void rollbackQuietly(Connection conn) {
        if(conn!=null){
            try {
                conn.rollback();
            } catch (SQLException e) {

            }
        }
    }

    public static void closeQuielty(ResultSet rs) {
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {

            }
        }
    }

    public static void closeQuielty(Statement statement) {
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {

            }
        }
    }

    public static void closeQuielty(Connection conn) {
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {

            }
        }
    }
}

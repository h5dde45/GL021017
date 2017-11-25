package ru.jee0213.jdbc.dao;


import ru.jee0213.jdbc.bean.User;
import ru.jee0213.jdbc.exception.DBSystemException;
import ru.jee0213.jdbc.exception.NotUniqueUserLoginException;
import ru.n3.t3.NotUniqueUserMailException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJdbc implements UserDao {
    private static final String SELECT_ALL_SQL = "select id, login, email from user";
    private static final String DELETE_BY_ID_SQL = "delete from user where id=?";
    private static final String INSERT_SQL = "insert into user(login,email) values (?,?)";
    private static final String SELECT_BY_LOGIN = "select id from user where login=?";
    private static final String SELECT_BY_EMAIL = "select id from user where email=?";

    private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    private static final String JBBC_URL = "jdbc:mysql://localhost:3306/production_eshop";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";


//    static {
//        JdbcUtils.initDriver(DRIVER_CLASS_NAME);
//    }

    @Override
    public List<User> selectAll() throws DBSystemException {
        Connection conn = getConnection();
        Statement statement = null;
        ResultSet rs = null;
        System.out.println();

        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            statement = conn.createStatement();
            rs = statement.executeQuery(SELECT_ALL_SQL);
            List<User> result = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String login = rs.getString("login");
                String email = rs.getString("email");
                User user = new User(id);
                user.setLogin(login);
                user.setEmail(email);
                result.add(user);
            }
            conn.commit();
            return result;
        } catch (SQLException e) {
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't execute sql = '" + SELECT_ALL_SQL + "'", e);
        } finally {
            JdbcUtils.closeQuielty(rs);
            JdbcUtils.closeQuielty(statement);
            JdbcUtils.closeQuielty(conn);
        }
    }

    @Override
    public int deleteById(int id) throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement ps = null;

        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(DELETE_BY_ID_SQL);
            ps.setInt(1, id);
            int result = ps.executeUpdate();
            conn.commit();
            return result;
        } catch (SQLException e) {
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't execute sql = '" + SELECT_ALL_SQL + "'", e);
        } finally {
            JdbcUtils.closeQuielty(ps);
            JdbcUtils.closeQuielty(conn);
        }
    }

    @Override
    public void insert(User user) throws DBSystemException, NotUniqueUserLoginException,
            NotUniqueUserMailException {
        Connection conn = getConnection();
        PreparedStatement ps = null;

        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            if (existWithLogin0(conn, user.getLogin())) {
                throw new NotUniqueUserLoginException("Login '" + user.getLogin() + "'");
            }
            if (existWithEmail0(conn, user.getLogin())) {
                throw new NotUniqueUserMailException("Login '" + user.getEmail() + "'");
            }

            ps = conn.prepareStatement(INSERT_SQL);
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getEmail());
            int result = ps.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't execute sql = '" + SELECT_ALL_SQL + "'", e);
        } finally {
            JdbcUtils.closeQuielty(ps);
            JdbcUtils.closeQuielty(conn);
        }
    }

    private boolean existWithLogin0(Connection conn, String login) throws SQLException {
        PreparedStatement ps =conn.prepareStatement(SELECT_BY_LOGIN);
        ps.setString(1,login);
        ResultSet resultSet=ps.executeQuery();
        return resultSet.next();
    }

    private boolean existWithEmail0(Connection conn, String email) throws SQLException {
        PreparedStatement ps =conn.prepareStatement(SELECT_BY_EMAIL);
        ps.setString(1,email);
        ResultSet resultSet=ps.executeQuery();
        return resultSet.next();
    }

    public Connection getConnection() throws DBSystemException {

        try {
            return DriverManager.getConnection(JBBC_URL, LOGIN, PASSWORD);
        } catch (SQLException e) {
            throw new DBSystemException("Can't create connection", e);
        }
    }
}

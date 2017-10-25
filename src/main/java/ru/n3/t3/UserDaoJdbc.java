package ru.n3.t3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJdbc implements UserDao {
    private Connection connection;
    private static String SELECT_ALL_SQL="SELECT id,login,email FROM User";
    private static String JBBC_URL="jdbc:mysql://localhost:3306/production_eshop";
    private static String LOGIN="root";
    private static String PASSWORD="root";

    @Override
    public List<User> selectAll() throws DBSystemException {
        Connection conn = getConnection();
        Statement statement=null;
        ResultSet rs=null;

        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            statement=conn.createStatement();
            rs=statement.executeQuery(SELECT_ALL_SQL);
            List<User> result=new ArrayList<>();
            while (rs.next()){
                int id=rs.getInt("id");
                String login=rs.getString("login");
                String email=rs.getString("email");
                User user=new User(id);
                user.setLogin(login);
                user.setEmail(email);
            }
            conn.commit();
            return result;
        } catch (SQLException e) {
//            JdbcU
        }finally {

        }

        return null;
    }

    @Override
    public int deleteById() {
        return 0;
    }

    @Override
    public void insert(User user) {

    }

    public Connection getConnection() throws DBSystemException {

        try {
            return DriverManager.getConnection(JBBC_URL,LOGIN,PASSWORD);
        } catch (SQLException e) {
            throw new DBSystemException("Can't create connection",e);
        }
    }
}

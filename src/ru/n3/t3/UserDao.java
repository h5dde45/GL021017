package ru.n3.t3;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public List<User> selectAll() throws DBException, SQLException;

    public int deleteById() throws DBException;

    public void insert(User user)throws DBException,NotUniqueUserLoginException,NotUniqueUserMailException;

}

package ru.jee0213.jdbc.dao;

import ru.jee0213.jdbc.bean.User;
import ru.jee0213.jdbc.exception.DBSystemException;
import ru.jee0213.jdbc.exception.NotUniqueUserLoginException;
import ru.jee0213.jdbc.exception.NotUniqueUserMailException;

import java.util.List;

public interface UserDao {
     List<User> selectAll() throws DBSystemException;
     int deleteById(int id) throws DBSystemException;
     void insert(User user) throws DBSystemException, NotUniqueUserLoginException, NotUniqueUserMailException, ru.n3.t3.NotUniqueUserMailException;
}

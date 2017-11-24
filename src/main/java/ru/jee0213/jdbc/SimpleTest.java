package ru.jee0213.jdbc;


import ru.jee0213.jdbc.dao.UserDao;
import ru.jee0213.jdbc.dao.UserDaoJdbc;
import ru.jee0213.jdbc.exception.DBException;

public class SimpleTest {
    public static void main(String[] args) throws DBException {
        UserDao dao=new UserDaoJdbc();
        System.out.println(dao.selectAll());
        dao.deleteById(4);
        System.out.println(dao.selectAll());
    }
}

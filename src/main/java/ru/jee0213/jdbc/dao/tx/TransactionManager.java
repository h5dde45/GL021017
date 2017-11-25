package ru.jee0213.jdbc.dao.tx;

import java.util.concurrent.Callable;

public interface TransactionManager {
    <T> T doInTransaction(Callable<T> unitOfWork)throws Exception;
}

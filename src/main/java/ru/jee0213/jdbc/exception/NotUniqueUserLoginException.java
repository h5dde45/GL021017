package ru.jee0213.jdbc.exception;

public class NotUniqueUserLoginException extends DBException{
    public NotUniqueUserLoginException(String message) {
        super(message);
    }

    public NotUniqueUserLoginException(String message, Throwable cause) {
        super(message, cause);
    }
}

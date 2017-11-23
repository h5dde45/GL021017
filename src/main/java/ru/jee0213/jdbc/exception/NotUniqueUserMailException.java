package ru.jee0213.jdbc.exception;

public class NotUniqueUserMailException extends DBException{
    public NotUniqueUserMailException(String message) {
        super(message);
    }

    public NotUniqueUserMailException(String message, Throwable cause) {
        super(message, cause);
    }
}

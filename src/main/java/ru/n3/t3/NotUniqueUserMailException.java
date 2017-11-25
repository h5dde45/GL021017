package ru.n3.t3;

public class NotUniqueUserMailException extends Exception {
    public NotUniqueUserMailException(String message) {
        super(message);
    }

    public NotUniqueUserMailException(String message, Throwable cause) {
        super(message, cause);
    }
}

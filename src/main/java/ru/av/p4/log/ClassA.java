package ru.av.p4.log;

import java.util.logging.Logger;

public class ClassA {
    private static final Logger LOGGER = Logger.getLogger(ClassA.class.getName());

    public void doSomeThing() {
        LOGGER.fine("A - fine");
        LOGGER.config("A - config");
        LOGGER.info("A - info");
    }
}

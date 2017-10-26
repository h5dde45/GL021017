package ru.av.p4.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassB {
    private static final Logger LOGGER = Logger.getLogger(ClassB.class.getName());


    public void doSomeThingElse() {
        LOGGER.log(Level.INFO,"ClassB: {0}",234);
        LOGGER.log(Level.SEVERE,"Exception",new Exception());
    }
}

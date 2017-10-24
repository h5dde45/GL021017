package ru.sl.p17;

import java.io.*;

public class Serializator {
    public boolean serialization(Stud st, String filename) {
        boolean flag = false;
        File f = new File(filename);
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(f);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(st);
            flag = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public Stud deSerialization(String fileName) throws InvalidObjectException {
        File f = new File(fileName);
        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Stud stud = (Stud) ois.readObject();
            return stud;
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not deserialize");
    }
}
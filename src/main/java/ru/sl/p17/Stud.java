package ru.sl.p17;

import java.io.Serializable;

public class Stud implements Serializable{
    protected static String facult;
    private String name;
    private int id;
    private transient String pass=null;
    private static final long longSerVers=1L;


    public Stud(String nameFacult,String name, int id, String pass) {
        facult=nameFacult;
        this.name = name;
        this.id = id;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", pass='" + pass + '\'' +
                ", facult='" + facult + '\'' +
                '}';
    }
}

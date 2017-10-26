package ru.av.p2;

public class NewInteger {

    private final int value;
    public static final int MAX_VALUE=0x7f_ff_ff_ff;
    public static final int MIN_VALUE=0x80_00_00_00;

    public NewInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewInteger)) return false;

        NewInteger integer = (NewInteger) o;

        return value == integer.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    public static NewInteger valueof(int value){
        return new NewInteger(value);
    }
}

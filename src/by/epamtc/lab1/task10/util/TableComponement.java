package by.epamtc.lab1.task10.util;

import java.io.Serializable;


public class TableComponement implements Serializable {
    private double vaiue;
    private double result;

    public TableComponement(double vaiue, double result) {
        this.vaiue = vaiue;
        this.result = result;
    }

    public double getVaiue() {
        return vaiue;
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Table"+"@"+"{" +
                "vaiue=" + vaiue +
                ", result=" + result +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableComponement table = (TableComponement) o;
        return Double.compare(table.vaiue, vaiue) == 0 &&
                Double.compare(table.result, result) == 0;
    }

    @Override
    public int hashCode() {
        return (int)((37+result)*vaiue);
    }
}

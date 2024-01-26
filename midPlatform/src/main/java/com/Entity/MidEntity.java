package com.Entity;

public class MidEntity {

    int id;

    String val1;

    public MidEntity() {
    }

    public MidEntity(int id, String val1) {
        this.id = id;
        this.val1 = val1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    @Override
    public String toString() {
        return "MidEntity{" +
                "id=" + id +
                ", val1='" + val1 + '\'' +
                '}';
    }
}

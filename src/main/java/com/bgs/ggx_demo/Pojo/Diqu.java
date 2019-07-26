package com.bgs.ggx_demo.Pojo;

public class Diqu {
    private int id;
    private String dname;

    @Override
    public String toString() {
        return "Diqu{" +
                "id=" + id +
                ", dname='" + dname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}

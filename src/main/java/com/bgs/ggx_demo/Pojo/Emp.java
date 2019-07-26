package com.bgs.ggx_demo.Pojo;

public class Emp {
    private int id;
    private String Ename;
    private String Esix;
    private String Ewages;
    private String Elevel;
    private Integer Did;
    private String dname;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", Ename='" + Ename + '\'' +
                ", Esix='" + Esix + '\'' +
                ", Ewages='" + Ewages + '\'' +
                ", Elevel='" + Elevel + '\'' +
                ", Did=" + Did +
                ", dname='" + dname + '\'' +
                '}';
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getEsix() {
        return Esix;
    }

    public void setEsix(String esix) {
        Esix = esix;
    }

    public String getEwages() {
        return Ewages;
    }

    public void setEwages(String ewages) {
        Ewages = ewages;
    }

    public String getElevel() {
        return Elevel;
    }

    public void setElevel(String elevel) {
        Elevel = elevel;
    }

    public Integer getDid() {
        return Did;
    }

    public void setDid(Integer did) {
        Did = did;
    }
}

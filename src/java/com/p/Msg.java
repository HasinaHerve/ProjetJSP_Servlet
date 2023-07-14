package com.p;

public class Msg {
    protected String msg;
    protected String dateE;
    protected String heureE;
    protected String nomR;
    protected String nomU;
    
    public Msg(String msg, String dateE, String heureE, String nomR, String nomU) {
        this.msg = msg;
        this.dateE = dateE;
        this.heureE = heureE;
        this.nomR = nomR;
        this.nomU = nomU;
        
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setDateE(String dateE) {
        this.dateE = dateE;
    }

    public void setHeureE(String heureE) {
        this.heureE = heureE;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public void setNomU(String nomU) {
        this.nomU = nomU;
    }


    public String getMsg() {
        return msg;
    }

    public String getDateE() {
        return dateE;
    }

    public String getHeureE() {
        return heureE;
    }

    public String getNomR() {
        return nomR;
    }

    public String getNomU() {
        return nomU;
    }


    
}

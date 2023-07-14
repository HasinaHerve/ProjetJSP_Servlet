package com.p;

import java.sql.Date;



public class Reclassement {
    int im;
    int num;
    Date dateR;
    public Reclassement(int im, int num, Date dateR) {
        this.im = im;
        this.num = num;
        this.dateR = dateR;
    }
    public void setIm(int im) {
        this.im = im;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDateR(Date dateR) {
        this.dateR = dateR;
    }

    public int getIm() {
        return im;
    }

    public int getNum() {
        return num;
    }

    public Date getDateR() {
        return dateR;
    }

    
}

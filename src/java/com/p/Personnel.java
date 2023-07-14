package com.p;

import java.sql.Date;

public class Personnel {
    int im;
    String cin;
    String nom;
    String prenoms;
    String aa;
    String lt;
    String adresse;
    String stat;
    String sm;
    String grade;
    String cat;
    int indice;
    String tel;
    Date dateE;
    Date dateNaiss;

    

    public Personnel(int im, String cin, String nom, String prenoms, String aa, String lt, String adresse, String stat, String sm, String grade, String cat, int indice, String tel, Date dateE, Date dateNaiss) {
        this.im = im;
        this.cin = cin;
        this.nom = nom;
        this.prenoms = prenoms;
        this.aa = aa;
        this.lt = lt;
        this.adresse = adresse;
        this.stat = stat;
        this.sm = sm;
        this.grade = grade;
        this.cat = cat;
        this.indice = indice;
        this.tel = tel;
        this.dateE = dateE;
        this.dateNaiss = dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }
    public Personnel(){
        
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getCat() {
        return cat;
    }

    public int getIndice() {
        return indice;
    }
    

    public Date getDateE() {
        return dateE;
    }

    public void setDateE(Date dateE) {
        this.dateE = dateE;
    }

    

    

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }
    
   
    public void setIm(int im) {
        this.im = im;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public void setLt(String lt) {
        this.lt = lt;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getIm() {
        return im;
    }

    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public String getAa() {
        return aa;
    }

    public String getLt() {
        return lt;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getStat() {
        return stat;
    }

    public String getSm() {
        return sm;
    }

    public String getGrade() {
        return grade;
    }

    
}

package com.p;

public class Bean implements java.io.Serializable {
    private String nom;
    public Bean(String nom) {  
        this.nom=nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getNom(){
        return this.nom;
    }
}

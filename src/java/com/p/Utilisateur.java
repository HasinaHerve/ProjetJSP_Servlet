package com.p;
public class Utilisateur {
    protected int im;
    protected String nom;
    protected String mdp;
    protected String pdp;
    public Utilisateur(int im,String nom, String mdp){
        this.im=im;
        this.nom=nom;
        this.mdp=mdp;
    }
    public Utilisateur(int im,String nom, String mdp, String pdp){
        this.im=im;
        this.nom=nom;
        this.mdp=mdp;
        this.pdp=pdp;
    }

    public void setIm(int im) {
        this.im = im;
    }

    public int getIm() {
        return im;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getPdp() {
        return pdp;
    }

    public void setPdp(String pdp) {
        this.pdp = pdp;
    }
}

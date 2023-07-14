package com.p;

public class Grade {
    int num;
    String grade;
    int duree;
    public Grade() {
    }
    public Grade(int num, String grade, int duree) {
        this.num = num;
        this.grade = grade;
        this.duree = duree;
    }
    
    public int getNum() {
        return num;
    }


    public String getGrade() {
        return grade;
    }

    public int getDuree() {
        return duree;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    
}

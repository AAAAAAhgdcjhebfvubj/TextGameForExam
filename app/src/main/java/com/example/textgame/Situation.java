package com.example.textgame;

public class Situation {
    Situation[] direction;
    String subject,text;
    int dL,dP,dR;
    public Situation (String subject, String text, int variants, int dl,int dp,int dr) {
        this.subject=subject;
        this.text=text;
        dL=dl;
        dP=dp;
        dR=dr;
        direction=new Situation[variants];
    }
}
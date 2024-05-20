package com.example.textgame;

public class Character {
    public static int L;//учеба
    public static int R;//репутация
    public static int P;//перспектива

    public String name;

    public Character(String name) {
        L = 0;
        R = 100;
        P = 10;
        this.name = name;
    }
}

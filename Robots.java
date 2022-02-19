package com.learning;

import java.util.Scanner;

public class Robots {

    private String name;
    private int hight;
    private boolean warm;

    public void setName(String Name) {
        name = Name;
    }

    public void setHight(int Hight) {
        hight = Hight;
    }

    public void setWarm(boolean x) {
        warm = x;
    }

    public void PrintParament() {
        System.out.println("My name is: " + name);
        System.out.println("My old is: " + hight);
        System.out.println("Warm: " + warm);
    }
}


package com.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Robots robot1 = new Robots();
        Test robot2 = new Test();


        robot1.PrintParament();

        robot2.setName("Anatoliy");

        robot1.setName("Bogdan");
        robot1.setHight(178);
        robot1.setWarm(true);
        robot2.say();

        robot1.PrintParament();
        robot2.PrintParament();

    }

}

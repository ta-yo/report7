package jp.ac.uryukyu.ie.e165753;

import java.util.Scanner;
public class Player {
    private String name;
    private String mark;

    Player(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getMark() {
        return mark;
    }

    public int play() {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextInt()) {
            return 0;
        }
        int number = scan.nextInt();
        if (number >= 1 && number <= 9) {
            return number;
        }
        return 0;
    }
}

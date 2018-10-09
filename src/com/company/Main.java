package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        Random person = new Random(scan.nextLine());
        System.out.println("Hello " + person.name + "! Your random perfect square is " + person.perfectRandom());

    }
}

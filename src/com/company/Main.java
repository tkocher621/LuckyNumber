package com.company;
import java.util.*;

public class Main {

    private static Vector<Random> Names = new Vector<>();

    private static void PromptNum(Random person)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(person.name + ", your random perfect square is " + person.perfectRandom());
        System.out.println("What would you like to do?\n0 - New number\n1 - Listing of names and numbers\n2 - Enter another name");

        int input = scan.nextInt();

        if (input == 0)
        {
            PromptNum(person);
        }
        else if (input == 1)
        {
            for (Random dude : Names)
            {
                System.out.println(dude.name + " - " + dude.num);
            }
        }
        else if (input == 2)
        {
            PromptName();
        }
    }

    private static void PromptName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        Random person = new Random(scan.nextLine());
        System.out.println("Hello " + person.name + "!");
        Names.add(person);
        PromptNum(person);
    }

    public static void main(String[] args)
    {
        PromptName();
    }
}

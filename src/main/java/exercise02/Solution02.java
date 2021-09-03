package exercise02;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        //prompts user for an input string
        //displays output that shows the input string
        //and the number of characters the string contains.

        //input
        String initialString = new String();
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        initialString = input.nextLine();
        //output
        System.out.println(initialString + " has " + initialString.length() + " characters.");
    }
}

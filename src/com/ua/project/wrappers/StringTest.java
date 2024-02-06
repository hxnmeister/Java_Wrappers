package com.ua.project.wrappers;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        byte[] bytesFromString = "Simple Text!".getBytes();
        StringBuilder builder = new StringBuilder("Hey!");
        String[] strings;
        String str1 = "Hello World!";
        String str2 = new String("Bye World!");
        String str3 = String.valueOf(new char[] {'J', 'a', 'v', 'a'});
        String str4 = new String(bytesFromString, StandardCharsets.UTF_8);
        String str5 = builder.append(" How are you?").toString();

        Scanner scanner = new Scanner(System.in);
        String inputString;
        String buildedString;
        String formatingString = " I_am_a_new_line ";
        String formatedString = formatingString.trim().replace("_", " ") + "!";
        String fruits = "Orange,Apple,Pomegranate,Pear";
        String[] separatedFruits = fruits.split(",");
        String longestWord = separatedFruits != null && separatedFruits.length > 0 ? separatedFruits[0] : "";

        for (String separatedFruit : separatedFruits) {
            if(separatedFruit.length() > longestWord.length()){
                longestWord = separatedFruit;
            }
        }

        strings = new String[] {str1, str2, str3, str4, str5, formatedString, formatingString, fruits, longestWord};

        System.out.printf("\n Longest word: %s%n", longestWord.toLowerCase());
        System.out.printf("\n Longest word (short variant): %s%n", longestWord.toLowerCase().substring(0, 3));
        System.out.print("-".repeat(20));

        System.out.printf("\n Before formatting: %s%n", formatingString);
        System.out.printf("\n After formatting: %s%n", formatedString);
        System.out.print("-".repeat(20));

        System.out.print("\n Enter the string: ");
        inputString = scanner.nextLine();

        if(inputString.toLowerCase().contains("error")){
            System.out.println(" An error occurred!");
        } else {
            if(inputString.startsWith("Execute")){
                System.out.println(" Executing the process!");
            }
            if(inputString.endsWith("completed")){
                System.out.println(" Process completed!");
            }
        }
        System.out.print("-".repeat(20));

        builder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            builder.append((i + 1) % 3 == 0 ? strings[i] + "\n" : strings[i]);
        }

        buildedString = builder.reverse().toString();

        System.out.println(buildedString);
        System.out.print("-".repeat(20));
    }
}

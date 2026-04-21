package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {

    public static void main(String[] args) {

        //create a scanner to take the input
        Scanner theScanner = new Scanner(System.in);
        System.out.println("Enter the name of a story: ");

        //store the answer to the above question
        String storyName = theScanner.nextLine();

        //now I need to take the story name and see if I can read a file
        //of the same name
        try {
            FileReader fileReader = new FileReader("src/main/resources/" + storyName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line;
            while((line = bufReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Can't find file");
        }

    }

}

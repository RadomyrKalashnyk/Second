package org.john;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        readFile("image029.png");
        sayAU();
    }
    private static void readFile(String fileName){
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static String sayAU() {
        return "AU!AU!AU!";
    }
}
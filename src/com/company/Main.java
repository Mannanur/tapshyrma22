package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("alfavit");){

            writer.write("Aa\nBb\nCc\nDd\nEe\nFf\nGg\nHh\nIi\nJj\nKk\nLl\nMm\nNn\nOo\nPp\nQq\nRr\nSs\nTt\nUu\n"+
                            "Vv\nWw\nXx\nYy\nZz\n");


            writer.write("0\n1\n2\n3\n4\n5\n6\n7\n8\n9");
        }
        catch (IOException e) {
            System.out.println("som problems with creating a file");
        }
        try (FileReader reader = new FileReader("alfavit");){
            Scanner scanner = new Scanner(reader);
            for (int i=1; scanner.hasNextLine(); i++) {
            System.out.println(i+" : "+scanner.nextLine());
        }}
        catch (IOException e) {
            System.out.println("som problems with creating a file");
        }
    }
}

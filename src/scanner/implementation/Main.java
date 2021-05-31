package scanner.implementation;

import scanner.implementation.project.Parser;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World from Main");
        Parser myParser = new Parser("data/sample.txt");
        myParser.parse();
    }
}
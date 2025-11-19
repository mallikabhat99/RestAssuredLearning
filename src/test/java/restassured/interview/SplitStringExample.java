package restassured.interview;

public class SplitStringExample {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";

        // Split the string by a single space
        String[] words = sentence.split(" ");

        System.out.println("Splitting by single space:");
        for (String word : words) {
            System.out.println(word);
        }

        // Split the string by one or more whitespace characters (including tabs, multiple spaces)
        String sentenceWithMultipleSpaces = "Another    sentence  with   various   spaces.";
        String[] wordsRegex = sentenceWithMultipleSpaces.split("\\s+");

        System.out.println("\nSplitting by one or more whitespace characters:");
        for (String word : wordsRegex) {
            System.out.println(word);
        }
    }
}
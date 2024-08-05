package com.griddynamics.nchmiel.javafundamentals.interviewreview;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String yellowSubmarine =
                "We all live in a yellow submarine\n" +
                        "Yellow submarine, yellow submarine\n" +
                        "We all live in a yellow submarine\n" +
                        "Yellow submarine, yellow submarine\n";

        yellowSubmarine = yellowSubmarine.toLowerCase()
                .replaceAll("\n", " ")
                .replaceAll(",", "");

        String[] inputStringInArray = yellowSubmarine.split(" ");
        List<String> list = Arrays.asList(inputStringInArray);
        System.out.println(list);

        // Split the string into words
        String[] words = yellowSubmarine.split(" ");

        // Create a map to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Print the word counts
        System.out.println(wordCountMap);

    }
}

package com.griddynamics.nchmiel.javafundamentals.interviewreview;

public class WellIdeas {

    public static String well(String[] givenArr) {
        int goodCount = 0;
        for(String word : givenArr) {
            if(word.equals("good")){
                goodCount++;
            }
        }
        if (goodCount == 0) {
            return "Fail!";
        } else if (goodCount <= 2) {
            return "Publish!";
        } else {
            return "I smell a series!";
        }
    }

    public static void main(String[] args){
        String[] givenArr = { "bad", "bad"};

        String result = well(givenArr);
        System.out.println(result);
    }
}

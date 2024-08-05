package com.griddynamics.nchmiel.javafundamentals.interviewreview;

public class FootballTeamPoints {
    public static int calculatePoints(String[] matches) {
        int totalPoints = 0;

        for(String match : matches) {
            String[] scores = match.split(":");
            int ourScore = Integer.parseInt(scores[0]);
            int opponentScores = Integer.parseInt(scores[1]);

            if(ourScore > opponentScores) {
                totalPoints += 3;
            } else if (ourScore == opponentScores) {
                totalPoints += 1;
            }
        }
        return totalPoints;
    }
    public static void main(String[] args) {
        String[] matchResults = {"3:1", "2:2", "0:1", "1:0", "4:4", "2:1", "3:3", "1:2", "0:0", "3:2"};

        int totalPoints = calculatePoints(matchResults);

        System.out.println("Total points: " + totalPoints);
    }
}

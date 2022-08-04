package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String message){
        if (message.contains("happy mood")) {
            System.out.println("HAPPY");
            return "HAPPY MOOD";
        }
        else {
            System.out.println("sad");
            return "SAD MOOD";
        }
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.analyseMood("I'm in sad mood today");
    }
}

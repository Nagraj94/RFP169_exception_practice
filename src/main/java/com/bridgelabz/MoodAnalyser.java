package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String message){
        if (message.contains("happy mood")) {
            System.out.println("HAPPY");
            return "HAPPY MOOD";
        }
        else {
            System.out.println("SAD");
            return "SAD MOOD";
        }
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.analyseMood("I'm in happy mood today");
    }
}

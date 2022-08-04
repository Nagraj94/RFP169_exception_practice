package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String message){
        try {
            message.contains("happy mood");
            System.out.println("happy");
            return "HAPPY MOOD";
        }
        catch (Exception e){
            System.out.println("sad");
            return "SAD MOOD";
        }
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.analyseMood("I'm in any mood today");
    }
}

package com.bridgelabz;

public class MoodAnalyser {
    enum Mood {
        SAD, HAPPY
    }

    String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public Mood analyseMood() throws MoodAnalyserException {
        try {
            if (this.message.contains("sad")) {
                return Mood.SAD;
            } else
                return Mood.HAPPY;
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Mood is EMPTY");
        }
    }
}
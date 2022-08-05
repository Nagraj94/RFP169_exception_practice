package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    void givenSadMessage_ShouldReturnSAD() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        MoodAnalyser.Mood mood = moodAnalyser.analyseMood();
        Assertions.assertEquals(MoodAnalyser.Mood.SAD, mood);
    }

    @Test
    void givenAnyMessage_ShouldReturnHAPPY() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        MoodAnalyser.Mood mood = moodAnalyser.analyseMood();
        Assertions.assertEquals(MoodAnalyser.Mood.HAPPY, mood);
    }

    @Test
    void givenNullMood_ShouldThrowMoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        Assertions.assertThrows(MoodAnalyserException.class, () -> moodAnalyser.analyseMood());
    }

    @Test
    void givenEmptyMood_ShouldThrowMoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Assertions.assertThrows(MoodAnalyserException.class, () -> moodAnalyser.analyseMood());
    }
}
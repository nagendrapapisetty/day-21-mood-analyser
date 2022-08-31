package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    MoodAnalyser object ;
    @BeforeEach
    public void setUp()
    {
        object = new MoodAnalyser("I am in Sad mood");
    }
    @Test
    public void moodAnalyser()
    {
        String ans = object.moodAnalyser();
        Assertions.assertEquals("SAD",ans);
        System.out.println(ans);
    }
}